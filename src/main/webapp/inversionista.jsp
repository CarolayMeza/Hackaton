<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Inversionista</title>
</head>
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
						datos del cliente</h1>
					<form action="controlador_campesinos" method="post">
						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="nombre"
									class="form-control my-3 p-4 " name="nombre"
									value="<%=nombre%>" required> <input type="hidden"
									name="nombre" value="<%=nombre%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="text" placeholder="apellido"
									class="form-control my-3 p-4" name="apellido"
									value="<%=apellido%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="email" placeholder="correo electrónico"
									class="form-control my-3 p-4" name="correo" value="<%=correo%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7" type="text" placeholder="name"
								aria-label="name">
								<input type="text" placeholder="telefono"
									class="form-control my-3 p-4" name="telefono" value="<%=telefono%>">
							</div>
						</div>


						<div class="from-row">
							<div class="col-lg-7">
								<input type="number" placeholder="cedula"
									class="form-control my-3 p-4" name="cedula"
									value="<%=cedula%>">
							</div>
						</div>

						<div class="from-row">
							<div class="col-lg-7">
								<input type="number" placeholder="contraseña"
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