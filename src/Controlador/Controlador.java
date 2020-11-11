package Controlador;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Producto;
import Modelo.ProductoDAO;

@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	ProductoDAO dao= new ProductoDAO();
	Producto p = new Producto();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion=request.getParameter("accion");
		switch (accion) {
		case "listar":
			List<Producto>datos=dao.listar();
			request.setAttribute("datos", datos);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			dao.listar();
			break;
		case "nuevo":
			request.getRequestDispatcher("vistas/add.jsp").forward(request, response);
			break;
		case "Agregar":
			String codigo=request.getParameter("txtCodigo");
			String nombre=request.getParameter("txtNombre");
			String precio=request.getParameter("txtPrecio");
			String stock=request.getParameter("txtStock");
			p.setCodigo(codigo);
			p.setNombre(nombre);
			p.setPrecio(precio);
			p.setStock(stock);
			dao.agregar(p);
			request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
			break;
		case "Buscar":
			String nom=request.getParameter("txtBuscar");
			List<Producto>listar=dao.busqueda(nom);
			request.setAttribute("datos", listar);
			request.getRequestDispatcher("vistas/resultado.jsp").forward(request, response);
		default:
			break;
		}
	}
}
