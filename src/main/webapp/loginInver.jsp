<!--   <meta http-equiv="refresh" content="0;url=${pageContext.request.contextPath}/ventas.jsp"> -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" href="Css\style.css">
<title>Website Click Inversionista</title>
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



	<div class="container text-center my-5">
		<a class="Hackaton" href="index.jsp"><img
			style="border-radius: 20px;" src="Imagen/Logo1.jpg" class="img-luid"
			alt=""></a>
	</div>


		<div class="container">


			<div class="row justify-content-center">
				<div align='center' class="col-lg-7  text-center">
					<h1 style="color: white">BIENVENIDO INVERSIONISTA</h1>
					<h1 style="color: white">inicio sesi�n</h1>
					<div class="col my-3 text-center">


						<form action="Control_login" method="post">

							<!--  Ingresando admininicial -->
							<input type="text" placeholder="Usuario o Correo Electronico"
								name="Correo" class="form-control my-3 p-4 text-center">


							<!--  Ingresando contrase�a admin123456 -->

							<input type="password" name="Contrase�a" placeholder="****"
								class="form-control my-3 p-4 text-center"> <input
								type="submit" name="Ingreso" value="Ingresar"
								class="btn btn-info mt-3px mb-5 text-center"> <a
								href="inversionista.jsp"></a>
						</form>
					</div>
				</div>
			</div>

		</div>

</body>
</html>