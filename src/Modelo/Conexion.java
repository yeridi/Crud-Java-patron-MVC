package Modelo;
import java.sql.*;
public class Conexion {
	Connection con;
	public String driver="com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/semana7";
	public String usuario = "root";
	public String clave = "";
	
	public Connection conectar() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(cadena,usuario,clave);
		}catch(Exception e) {
			System.out.println("Error con la conexion");
		}
		return con;
	}
}
