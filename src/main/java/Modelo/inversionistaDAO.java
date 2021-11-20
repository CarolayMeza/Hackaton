package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.conexion;

public class inversionistaDAO {
	
	conexion conec = new conexion();
	Connection con = conec.Conectar();
	PreparedStatement ps = null;
	ResultSet res = null;

	public boolean Crear_Inversionista(inversionistaDTO inversionista) {
		boolean resul = false;
		try {
			String sql = "insert into inversionista values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, inversionista.getNombre_inversionista());
			ps.setString(2, inversionista.getApellido_inversionista());
			ps.setString(3, inversionista.getCorreo_inversionista());
			ps.setString(4, inversionista.getTelefono_iversionista());
			ps.setString(5, inversionista.getCedula_inversionista());
			ps.setString(6, inversionista.getContrasena_inversionista());
			
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, " inversionista insertado ");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al insertar: " + ex);
		}
		return resul;
	}

	public inversionistaDTO Buscar_Inversionista(String cedula) {
		
		JOptionPane.showMessageDialog(null,cedula);
		inversionistaDTO user = null;
		try {
			String sql = "select * from inversionista where Cedula_inversionista=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, cedula);
			res = ps.executeQuery();
			while (res.next()) {
				user = new inversionistaDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5),res.getString(6));
			}
		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null,"Error al consultar" +e.getMessage());
			System.out.println("Error al Consultar = " + e.getMessage());
		}

		return user;
	}

	public boolean Actualizar_Inversionista(inversionistaDTO user) {
		boolean resul = false;
		try {
			String sql = "update inversionista set Nombre_inversionista=?, Apellido_inversionista=?,Correo_inversionista=?, Telefono_iversionista=?, Contrasena_inversionista=?, Fotos_inversionista=? where Cedula_inversionista=?";
			ps = con.prepareStatement(sql);

			
			ps.setString(1, user.getNombre_inversionista());
			ps.setString(2, user.getApellido_inversionista());
			ps.setString(3, user.getCorreo_inversionista());
			ps.setString(4, user.getTelefono_iversionista());
			ps.setString(5, user.getCedula_inversionista());
			ps.setString(6, user.getContrasena_inversionista());
			
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, "Se actualizo");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al actualizar: " + ex);
		}
		return resul;
	}

	public boolean Eliminar_Inversionista(String auxcedula) {
		boolean resul = false;
		try {
			String sql = "delete from Clientes where cedula_cliente=?";
			ps = con.prepareStatement(sql);

			ps.setString(1, auxcedula);
			resul = ps.executeUpdate() > 0;
			JOptionPane.showMessageDialog(null, "Se elimino el Cliente");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "error al eliminar: " + ex);
		}
		return resul;
	}

	public ArrayList<inversionistaDTO> cargar_select(){
			
		inversionistaDTO inversionista=null;
			ArrayList<inversionistaDTO> lista2= new ArrayList<>();
			try {
			String sql="select * from inversionistas";
			ps= con.prepareStatement(sql);
			res=ps.executeQuery();
			while(res.next()) {
				inversionista= new inversionistaDTO(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
			    lista2.add(inversionista);
			}
			}catch(SQLException ex) {}
			
			return lista2;
		}

}
