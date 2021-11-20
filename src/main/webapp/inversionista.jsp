<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous">
<link rel="stylesheet"  href="Css/style.css">
<link rel="stylesheet"  href="Css/normalize.css">
<title>Web Inversionista</title>
</head>

<body>
<jsp:include page="head3.jsp" />
<%!String mensaje = "";
	String nombre = "", apellido = "", correo = "", telefono = "", cedula = "", contrasena = "",estado="";%>

	<%
	if (request.getParameter("cedula") != null) {
		nombre = request.getParameter("nombre");
		apellido = request.getParameter("apellido");
		correo = request.getParameter("correo");
		telefono = request.getParameter("telefono");
		cedula = request.getParameter("cedula");
		contrasena = request.getParameter("contrasena");
		estado = "disabled";
	}
	%>
	<%
	if (request.getParameter("men") != null) {
		nombre = "";
		apellido = "";
		correo = "";
		telefono = "";
		cedula = "";
		contrasena ="";
		estado = "";

		mensaje = request.getParameter("men");
		out.print("<script>alert('" + mensaje + "');</script>");//Mensaje con alert js
	}
	%>
	
	<main class="loginInver">
		<div class="img3">
			<h1>REGISTRO DE INVERSIONISTAS</h1>
		</div>
	
		<div class="container">	
			<div class="logoCa">
				<img alt="Logo" src="Imagen/logo.png" class="logoo">
				<h1>Registro</h1>
				<form action="Control_login" method="post" class="login-from">
					
					<div class="input-group">
						<label class="input-fill">
							<input type="text"  name="nombre">
							<span class="input-label">Nombres</span>
							<i class="fas fa-envelope"></i>
						</label>
					</div>
					
					<div class="input-group">
						<label class="input-fill">
							<input type="text" name="apellido" >
							<span class="input-label">Apellidos</span>
							<i class="fas fa-lock"></i>
						</label>
					</div>

					<div class="input-group">
						<label class="input-fill">
							<input type="email" name="correo" >
							<span class="input-label">Correo Electronico</span>
							<i class="fas fa-lock"></i>
						</label>
					</div>

					<div class="input-group">
						<label class="input-fill">
							<input type="text" name="telefono" >
							<span class="input-label">Telefono</span>
							<i class="fas fa-lock"></i>
						</label>
					</div>

					<div class="input-group">
						<label class="input-fill">
							<input type="number" name="cedula" >
							<span class="input-label">Documento</span>
							<i class="fas fa-lock"></i>
						</label>
					</div>

					<div class="input-group">
						<label class="input-fill">
							<input type="number" name="contrasena" >
							<span class="input-label">Contraseña</span>
							<i class="fas fa-lock"></i>
						</label>
					</div>

					<input type="submit" name="buscar" value="Buscar" class="btn-login">
					<input type="submit" name="crear" value="Crear" class="btn-login">
					<input type="submit" name="actualizar" value="Actualizar" class="btn-login">
					<input type="submit" name="borrar" value="Borrar" class="btn-login"> 
				</form>
			</div>
		</div>
	
	</main>


</body>
</html>