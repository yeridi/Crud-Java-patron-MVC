package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Usuario;
import Modelo.UsuarioDAO;

@WebServlet("/ControladorU")
public class ControladorU extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO dao= new UsuarioDAO();
		Usuario u = new Usuario();
		int r;
		String accion=request.getParameter("accion");
		switch (accion) {
		case "nuevo":
			request.getRequestDispatcher("vistas/addusu.jsp").forward(request, response);
			break;
		case "Agregar":
			String apellido=request.getParameter("txtApellido");
			String nombre=request.getParameter("txtNombre");
			String usuario=request.getParameter("txtUsuario");
			String contrasena=request.getParameter("txtContrasena");
			u.setApellido(apellido);
			u.setNombre(nombre);
			u.setUsuario(usuario);
			u.setContrasena(contrasena);
			dao.agregar(u);
			request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
		case "login":
			request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
		case "entrar":
			String usu=request.getParameter("txtUsuario");
			String con=request.getParameter("txtContrasena");
			u.setUsuario(usu);
			u.setContrasena(con);
			r=dao.validar(u);
			if(r==1) {
				request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
			}else {
				request.getRequestDispatcher("ControladorU?accion=login").forward(request, response);
			}
		default:
			break;
		}
	}

}
