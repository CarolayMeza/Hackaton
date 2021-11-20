<!--   <meta http-equiv="refresh" content="0;url=${pageContext.request.contextPath}/ventas.jsp"> -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm" crossorigin="anonymous">
<link rel="stylesheet"  href="Css/style.css">
<link rel="stylesheet"  href="Css/normalize.css">
<title>Inicio de Sesi�n de Agricultores</title>
</head>
<body>
<jsp:include page="head.jsp" />

	<%!
    String ced="", cliente="";
    
    %>

	<%
if(request.getParameter("men")!=null){
cliente="";
ced="";
String mensaje=request.getParameter("men");
out.print("<script>alert('"+mensaje+"');</script>");//Mensaje con alert js
}
%>

<main class="loginInver">
	<div class="img2">
	<h1>BIENVENIDO AGRICULTOR</h1>
	</div>

	<div class="container">	
		<div class="logoCa">
			<img alt="Logo" src="Imagen/logo.png" class="logoo">
			<h1>Iniciar Sesión</h1>
			<form action="Control_login" method="post" class="login-from">
				<div class="input-group">
					<label class="input-fill">
						<input type="text"  name="Correo">
						<span class="input-label">Correo Electronico</span>
						<i class="fas fa-envelope"></i>
					</label>
				</div>
				
				<div class="input-group">
					<label class="input-fill">
						<input type="password" name="Contrasena" >
						<span class="input-label">Contrasena</span>
						<i class="fas fa-lock"></i>
					</label>
				</div>
				<a href="#">�Necesitas Una Cuenta?</a>
				<input type="submit" name="Ingreso" value="Ingresar" class="btn-login"> 
			</form>
		</div>
	</div>
</main>

</body>
</html>