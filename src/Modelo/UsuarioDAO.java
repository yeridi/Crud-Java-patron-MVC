package Modelo;

import java.sql.*;
public class UsuarioDAO {
	PreparedStatement ps;
	ResultSet rs;
	Conexion c = new Conexion();
	Connection con;
	
	public int agregar(Usuario usu) {
		int r=0;
		String sql="insert into usuario(apellido,nombre,usuario,contrasena) values(?,?,?,?)";
		try {
			con = c.conectar();
			ps=con.prepareStatement(sql);
			ps.setString(1, usu.getApellido());
			ps.setString(2, usu.getNombre());
			ps.setString(3, usu.getUsuario());
			ps.setString(4, usu.getContrasena());
			r= ps.executeUpdate();
			if(r==1) {
				r=1;
			}else {
				r=0;
			}
			
		} catch (Exception e) {
			System.out.println("errro en la consulta");
		}
		return r;
	}
	public int validar(Usuario usu) {
		int r=0;
		String sql="select * from usuario where usuario=? and contrasena=?";
		try {
			con = c.conectar();
			ps=con.prepareStatement(sql);
			ps.setString(1, usu.getUsuario());
			ps.setString(2, usu.getContrasena());
			rs=ps.executeQuery();
			while(rs.next()) {
				r=r+1;
				usu.setUsuario(rs.getString("usuario"));
				usu.setContrasena(rs.getString("contrasena"));
			}
			if(r==1) {
				return 1;
			}else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
}
