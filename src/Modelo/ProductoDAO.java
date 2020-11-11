package Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ProductoDAO {
	PreparedStatement ps;
	ResultSet rs;
	Conexion c = new Conexion();
	Connection con;
	
	public List listar() {
		List<Producto>lista=new ArrayList<>();
		String sql="select * from producto";
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Producto p =new Producto();
				p.setCodigo(rs.getString(1));
				p.setNombre(rs.getString(2));
				p.setPrecio(rs.getString(3));
				p.setStock(rs.getString(4));
				lista.add(p);
			}
		}catch(Exception e) {
			
		}
		return lista;
	}	
	public int agregar(Producto pro) {
		int r=0;
		String sql="insert into producto(codigo,nombre,precio,stock) values(?,?,?,?)";
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo());
			ps.setString(2, pro.getNombre());
			ps.setString(3, pro.getPrecio());
			ps.setString(4, pro.getStock());
			r=ps.executeUpdate();
			//para avisar que se ingreo datos
			if(r==1) {
				r=1;
			}else {
				r=0;
			}
		} catch (Exception e) {
			
		}
		return r;
	}
	public List busqueda(String texto) {
		List<Producto>listar=new ArrayList<>();
		String sql="select * from producto where nombre like '%"+texto+"%' or codigo like '%"+texto+"%'";
		try {
			con=c.conectar();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Producto p=new Producto();
				p.setCodigo(rs.getString("codigo"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getString("precio"));
				p.setStock(rs.getString("stock"));
				listar.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listar;

	}

}
