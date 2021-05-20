<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet" href="resources/css/login.css">
<title>Tienda</title>
</head>
<body>
	<div class="login">

		<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab">Iniciar Sesión</label> <input id="tab-2"
				type="radio" name="tab" class="sign-up"><label for="tab-2"
				class="tab">Registrarse</label>
			<div class="login-form">
				<div class="sign-in-htm">
					<div class="group">
						<label for="user" class="label">Email</label> <input id="user"
							type="text" class="input">
					</div>
					<div class="group">
						<label for="pass" class="label">Contraseña</label> <input id="pass"
							type="password" class="input" data-type="password">
					</div>
					<div class="group">
						<input id="check" type="checkbox" class="check" checked> <label
							for="check"><span class="icon"></span> Mantenerse conectado</label>
					</div>
					<form action="card3.jsp">
					<div class="group">
						<input type="submit" class="button" value="Ingresar">
					</div></form>
					<a href="table.jsp">
						Table
					</a>
					<a href="table2.jsp">
						Table2
					</a>
					<a href="card.jsp">
						Card
					</a>
					<a href="card2.jsp">
						Card2
					</a>
					<a href="card3.jsp">
						Card3
					</a>
					
					<div class="hr"></div>
					<div class="foot-lnk"></div>
				</div>
				<div class="sign-up-htm">
					<div class="group">
						<label for="user" class="label">Nombre</label> <input id="user"
							type="text" class="input">
					</div>
					<div class="group">
						<label for="pass" class="label">Contraseña</label> <input id="pass"
							type="password" class="input" data-type="password">
					</div>
					<div class="group">
						<label for="pass" class="label">Repetir Contraseña</label> <input
							id="pass" type="password" class="input" data-type="password">
					</div>
					<div class="group">
						<label for="pass" class="label">Email</label> <input
							id="pass" type="text" class="input">
					</div>
					<div class="group">
						<input type="submit" class="button" value="Registrar">
					</div>
					<div class="hr"></div>
					<div class="foot-lnk">
						<label for="tab-1">¿Ya está registrado?</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="resources/js/app.js"></script>
		<a class="link-red" href="https://www.facebook.com/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Facebook_Logo_%282019%29.png/1024px-Facebook_Logo_%282019%29.png"></a>
	</div>
</body>
</html>