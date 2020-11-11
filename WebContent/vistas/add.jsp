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
		<h1>Agregar Producto</h1>
		<form action="Controlador" method="POST">
			<table>
				<tr>
					<td>Codigo: </td>
					<td><input type="text" name="txtCodigo"></td>
				</tr>
				<tr>
					<td>Nombre: </td>
					<td><input type="text" name="txtNombre"></td>
				</tr>
				<tr>
					<td>Precio: </td>
					<td><input type="text" name="txtPrecio"></td>
				</tr>
				<tr>
					<td>Stock: </td>
					<td><input type="text" name="txtStock"></td>
				</tr>
				<tr>
					<td><input type="submit" name="accion" value="Agregar"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>