<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Agregar Nuevo Usuario</h1>
		<form action="ControladorU" method="POST">
			<table>
				<tr>
					<td>Apellido: </td>
					<td><input type="text" name="txtApellido"></td>
				</tr>
				<tr>
					<td>Nombre: </td>
					<td><input type="text" name="txtNombre"></td>
				</tr>
				<tr>
					<td>Usuario: </td>
					<td><input type="text" name="txtUsuario"></td>
				</tr>
				<tr>
					<td>Contraseņa: </td>
					<td><input type="text" name="txtContrasena"></td>
				</tr>
				<tr>
					<td><input type="submit" name="accion" value="Agregar"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>