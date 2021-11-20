<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Chewy&family=Lobster&family=Overlock:ital@1&family=Yeseva+One&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="Css/styles.css">
<title>Web Agricultor</title>
</head>
<%-- ESTE ES NUESTRO CABECERO --%>
<jsp:include page="head.jsp" /> 

<body>
<%!String mensaje = "";
	String nombre = "", apellido = "", correo = "", telefono = "", cedula = "", contrasenia = "",estado="";%>

	<%
	if (request.getParameter("cedula") != null) {
		nombre = request.getParameter("nombre");
		apellido = request.getParameter("apellido");
		correo = request.getParameter("correo");
		telefono = request.getParameter("telefono");
		cedula = request.getParameter("cedula");
		contrasenia = request.getParameter("contrasenia");
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
		contrasenia ="";
		estado = "";

		mensaje = request.getParameter("men");
		out.print("<script>alert('" + mensaje + "');</script>");//Mensaje con alert js
	}
	%>
	
	<section class="Form my-3 mx-7"
		style="background: url(Imagen/cafe1.jpg)">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-5"></div>
				<div class="col-lg-7 px-5 pt-5">
					<h1 style="color: #FFFFFF" class="font-weight-bold py-3">Ingrese
						datos del inversionista</h1>
					<form action="controlador_agricultor" method="post">
						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="cedula"
									class="form-control my-3 p-4 " name="cedula"
									value="<%=cedula%>" required> <input type="hidden"
									name="cedula" value="<%=cedula%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="nombre"
									class="form-control my-3 p-4" name="nombre"
									value="<%=nombre%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="apellido"
									class="form-control my-3 p-4" name="apellido" value="<%=apellido%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7" type="email" placeholder="correo"
								aria-label="name">
								<input type="text" placeholder="correo"
									class="form-control my-3 p-4" name="correo" value="<%=correo%>">
							</div>
						</div>


						<div class="from-row">
							<div class="col-lg-7">
								<input type="number" placeholder="telefono"
									class="form-control my-3 p-4" name="telefono"
									value="<%=telefono%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="contraseña"
									class="form-control my-3 p-4" name="contrasenia"
									value="<%=contrasenia%>">
							</div>
						</div>


						<div class="container">
							<div class="row">


								<div class="col-sm my-3">
									<button type="submit" class="btn btn-success mt-3px mb-5"
										name="buscar" value="buscar">consultar</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn btn-success mt-3px mb-5"
										name="crear" value="crear">crear</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn btn-success mt-3px mb-5"
										name="actualizar" value="actualizar">actualizar</button>
								</div>
								<div class="col-sm my-3">
									<button type="submit" class="btn btn-success mt-3px mb-5"
										name="borrar" value="borrar">borrar</button>
								</div>
							</div>
						</div>
					</form>


				</div>

			</div>
		</div>
		<footer> VIVA EL TINDER &copy; 2020 </footer>

	</section>
</body>
</html>