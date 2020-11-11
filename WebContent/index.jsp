<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h3>Listado de productos</h3>
	<form method="POST" action="Controlador">
		<input type="submit" value="listar" name="accion">
		<input type="submit" value="nuevo" name="accion"><br>
		<input type="text" name="txtBuscar">
		<input type="submit" value="Buscar" name="accion">
	</form>
	<table border="1">
		<thead>
			<tr>
				<th>Codigo</th>
				<th>Nombre</th>
				<th>Precio</th>
				<th>Stock</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dato" items="${datos}">
			<tr>
				<td>${dato.getCodigo()}</td>
				<td>${dato.getNombre()}</td>
				<td>${dato.getPrecio()}</td>
				<td>${dato.getStock()}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</center>
</body>
</html>