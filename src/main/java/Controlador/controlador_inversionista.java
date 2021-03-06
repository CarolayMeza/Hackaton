package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.inversionistaDTO;
import Modelo.inversionistaDAO;

@WebServlet("/controlador_inversionista")
public class controlador_inversionista  extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlador_inversionista() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	inversionistaDAO inversioDao= new inversionistaDAO(); 

	if(request.getParameter("crear")!=null) {
	String Nombre_inversionista,Apellido_inversionista,Correo_inversionista,Telefono_iversionista,Cedula_inversionista,Contrasena_inversionista;
	
	Nombre_inversionista = request.getParameter("nombre");
	Apellido_inversionista = request.getParameter("apellido");
	Correo_inversionista = request.getParameter("correo");
	Telefono_iversionista = request.getParameter("telefono");
	Cedula_inversionista = request.getParameter("cedula");
	Contrasena_inversionista = request.getParameter("contrasena");
	
	
	inversionistaDTO inversioDto = new inversionistaDTO(Nombre_inversionista, Apellido_inversionista, Correo_inversionista, Telefono_iversionista, Cedula_inversionista, Contrasena_inversionista, Contrasena_inversionista);
	if(inversioDao.Crear_Inversionista(inversioDto)) {
//		JOptionPane.showMessageDialog(null, "Clientes Registrado Exitosamente.");
		response.sendRedirect("index.jsp?men= Inversionista Registrado Exitosamente.");
	}else {
//		JOptionPane.showMessageDialog(null, "El Cliente no se Registro.");
		response.sendRedirect("inversionista.jsp?men=El Inversionista no se Registro.");
	}
	}
	
	if(request.getParameter("buscar")!=null) {
		 
		String Nombre_inversionista,Apellido_inversionista,Correo_inversionista,Telefono_inversionista,Cedula_inversionista,Contrasena_inversionista;
		
		Cedula_inversionista=request.getParameter("cedula");
		inversionistaDTO Buscadto=inversioDao.Buscar_Inversionista(Cedula_inversionista);
		
		if(Buscadto!=null) {
			
		Nombre_inversionista= Buscadto.getNombre_inversionista();
		Apellido_inversionista =Buscadto.getApellido_inversionista();
		Correo_inversionista = Buscadto.getCorreo_inversionista();
		Telefono_inversionista= Buscadto.getTelefono_inversionista();
		Cedula_inversionista=Buscadto.getCedula_inversionista();
		Contrasena_inversionista=Buscadto.getContrasena_inversionista();
		
		response.sendRedirect("inversionista.jsp?nombre="+Nombre_inversionista+"&&apellido="+Apellido_inversionista+"&&correo="+Correo_inversionista+"&&telefono="+Telefono_inversionista+"&&cedula="+Cedula_inversionista+"&&contrasena"+Contrasena_inversionista);
}else {
	response.sendRedirect("inversionista.jsp?men=El inversionista no existe");
}
	}
	if(request.getParameter("actualizar")!=null) {
		
		String Nombre_inversionista,Apellido_inversionista,Correo_inversionista,Telefono_inversionista,Cedula_inversionista,Contrasena_inversionista;
		
		Nombre_inversionista = request.getParameter("nombre");
		Apellido_inversionista = request.getParameter("apellido");
		Correo_inversionista = request.getParameter("correo");
		Telefono_inversionista = request.getParameter("telefono");
		Cedula_inversionista = request.getParameter("cedula");
		Contrasena_inversionista = request.getParameter("contrasena");
		
		inversionistaDTO inversionistaDto_Act = new inversionistaDTO(Nombre_inversionista, Apellido_inversionista, Correo_inversionista, Telefono_inversionista, Cedula_inversionista, Contrasena_inversionista);
		
		if(inversioDao.Actualizar_Inversionista(inversionistaDto_Act)) {

			response.sendRedirect("inversionista.jsp?men=Inversionista Actualizado Exitosamente.");
		}else {
	
			response.sendRedirect("inversionista.jsp?men=Inversionista no se Modifico.");
		}
		}
		
		
	if (request.getParameter("borrar")!=null) {
			
			String Cedula_inversionista;
			Cedula_inversionista=request.getParameter("cedula");
			
			int op = 0;
			//	int op=JOptionPane.showConfirmDialog(null, "Desea eliminar el Cliente de la :"+cedula_cliente);
			if(op==0) {
			if(inversioDao.Eliminar_Inversionista(Cedula_inversionista)) {
				response.sendRedirect("inversionista.jsp?men=Inversionista Eliminado");
				
			}else {
				response.sendRedirect("inversionista.jsp?men=Inversionista no se Elimin?");

			}
			
			
		}else {
			response.sendRedirect("inversionista.jsp");

		}
		
		
		
	}
		
	}
		
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	