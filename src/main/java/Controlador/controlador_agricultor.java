package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.agricultorDAO;
import Modelo.agricultorDTO;

/**
 * Servlet implementation class controlador_agricultor
 */
@WebServlet("/controlador_agricultor")
public class controlador_agricultor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_agricultor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		agricultorDAO campeDao= new agricultorDAO(); 

		if(request.getParameter("crear")!=null) {
		String nombre,apellido,correo,telefono,cedula,contrasenia;
		
		nombre=request.getParameter("nombre");
		apellido=request.getParameter("apellido");
		correo = request.getParameter("correo");
		telefono = request.getParameter("telefono");
		cedula = request.getParameter("cedula");
		contrasenia = request.getParameter("contrasenia");
		
		agricultorDTO campeDto = new agricultorDTO(nombre,apellido,correo,telefono,cedula,contrasenia);
		if(campeDao.Crear_Agricultor(campeDto)) {
			JOptionPane.showMessageDialog(null, "Campesino Registrado Exitosamente.");
			response.sendRedirect("campesino.jsp?men= Campesino Registrado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Campesino no se Registro.");
			response.sendRedirect("campesino.jsp?men=El Campesino no se Registro.");
		}
		}
		
		if(request.getParameter("buscar")!=null) {
			 
			String nombre,apellido,correo,telefono,cedula_campe,contrasenia;
			
			cedula_campe=request.getParameter("cedula");
			agricultorDTO Auxdto=campeDao.Buscar_Agricultor(cedula_campe);
			if(Auxdto!=null) {
			cedula_campe=Auxdto.getCedula_campesino();
			nombre = Auxdto.getNombre_campesino();
			apellido = Auxdto.getApellido_campesino();
			correo = Auxdto.getCedula_campesino();
			telefono = Auxdto.getTelefono_campesino();
			contrasenia = Auxdto.getContrasena_campesino();
			
			response.sendRedirect("campesino.jsp?cedula="+cedula_campe+"&&nombre="+nombre+"&&apellido="
			+apellido+"&&correo="+correo+"&&telefono="+telefono+"&&contrasenia="+contrasenia);
	}else {
		response.sendRedirect("campesino.jsp?men=El campesino no existe");
	}
		}
			
		
		if(request.getParameter("actualizar")!=null) {
			
		String nombre,apellido,correo,telefono,cedula_campe,contrasenia;
		
		nombre=request.getParameter("nombre");
		apellido=request.getParameter("apellido");
		correo = request.getParameter("correo");
		telefono = request.getParameter("telefono");
		cedula_campe = request.getParameter("cedula");
		contrasenia = request.getParameter("contrasenia");
		
		agricultorDTO campeDto_Act = new agricultorDTO(nombre,apellido,correo,telefono,cedula_campe,contrasenia);
		if(campeDao.Actualizar_Agricultor(campeDto_Act)) {
			JOptionPane.showMessageDialog(null, "Campesino se Actualizo Exitosamente.");
			response.sendRedirect("campesino.jsp?men=Campesino Actualizado Exitosamente.");
		}else {
			JOptionPane.showMessageDialog(null, "El Campesino no se Modifico.");
			response.sendRedirect("campesino.jsp?men=El Campesino no se Modifico.");
		}
		}
		
		
	if (request.getParameter("borrar")!=null) {
			
			String cedula_campe;
			cedula_campe=request.getParameter("cedula");
			
			int op=JOptionPane.showConfirmDialog(null, "Desea eliminar el Campesino de la :"+cedula_campe);
			if(op==0) {
			if(campeDao.Eliminar_Agricultor(cedula_campe)) {
				response.sendRedirect("campesino.jsp?men=Campesino Eliminado");
				
			}else {
				response.sendRedirect("campesino.jsp?men=Campesino no se Eliminó");

			}
			
			
		}else {
			response.sendRedirect("campesino.jsp");

		}
	}

	}
}
