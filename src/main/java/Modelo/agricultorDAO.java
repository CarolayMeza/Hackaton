package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.conexion;

public class agricultorDAO {
	conexion conec = new conexion();
	Connection con = conec.Conectar();
	PreparedStatement ps = null;
	ResultSet res = null;

	public boolean Crear_Cliente(agricultorDTO agricultor) {
		boolean resul = false;
		try {
			String sql = "insert into campesino values(?,?,?,?,?,?,? )";
			ps = con.prepareStatement(sql);
			ps.setString(1, agricultor.getNombre_campesino());
			ps.setString(2, agricultor.getApellido_campesino());
			ps.setString(3, agricultor.getCorreo_campesino());
			ps.setString(4, agricultor.getTelefono_campesino());
			ps.setString(5, agricultor.getCedula_campesino());
			ps.setString(6, agricultor.getContrasena_campesino());
			ps.setString(7, agricultor.getFotos_campesino());
			
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, " Cliente insertado ");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al insertar: " + ex);
		}
		return resul;
	}

	public agricultorDTO Buscar_Cliente(String cedula) {

		agricultorDTO user = null;
		try {
			String sql = "select * from campesinos where Cedula_campesino=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, cedula);
			res = ps.executeQuery();
			while (res.next()) {
				user = new agricultorDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5), res.getString(6), res.getString(7));
			}
		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
			System.out.println("Error al Consultar = " + e.getMessage());
		}

		return user;
	}

	public boolean Actualizar_Cliente(agricultorDTO user) {
		boolean resul = false;
		try {
			String sql = "update campesinos set Nombre_campesino=?, Apellido_campesino=?,Correo_campesino=?, Telefono_campesino=?, Contrasena_campesino=?, Fotos_campesino=? where Cedula_campesino=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, user.getNombre_campesino());
			ps.setString(2, user.getApellido_campesino());
			ps.setString(3, user.getCorreo_campesino());
			ps.setString(4, user.getTelefono_campesino());
			ps.setString(5, user.getCedula_campesino());
			ps.setString(6, user.getContrasena_campesino());
			ps.setString(7, user.getFotos_campesino());
			
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, "Se actualizo");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al actualizar: " + ex);
		}
		return resul;
	}

	public boolean Eliminar_Cliente(String auxcedula) {
		boolean resul = false;
		try {
			String sql = "delete from campesino where Cedula_campesino=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, auxcedula);
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, "Se elimino el Cliente");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al eliminar: " + ex);
		}
		return resul;
	}

	public ArrayList<agricultorDTO> cargar_select(){
			
		agricultorDTO cliente=null;
			ArrayList<agricultorDTO> lista2= new ArrayList<>();
			try {
			String sql="select * from campesino";
			ps= con.prepareStatement(sql);
			res=ps.executeQuery();
			while(res.next()) {
				cliente= new agricultorDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
			    lista2.add(cliente);
			}
			}catch(SQLException ex) {}
			
			return lista2;
		}

}
