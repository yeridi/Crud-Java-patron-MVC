package Modelo;

public class Usuario {
	private String apellido;
	private String nombre;
	private String usuario;
	private String contrasena;
	public Usuario() {

	}
	public Usuario(String apellido, String nombre, String usuario, String contrasena) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}
