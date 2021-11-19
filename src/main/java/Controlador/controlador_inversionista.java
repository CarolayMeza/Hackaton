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
	
	Nombre_inversionista = request.getParameter("Nombre_inversionista");
	Apellido_inversionista = request.getParameter("Apellido_inversionista");
	Correo_inversionista = request.getParameter("Correo_inversionista");
	Telefono_iversionista = request.getParameter("Telefono_iversionista");
	Cedula_inversionista = request.getParameter("Cedula_inversionista");
	Contrasena_inversionista = request.getParameter("Contrasena_inversionista");
	
	
	inversionistaDTO inversioDto = new inversionistaDTO(Nombre_inversionista, Apellido_inversionista, Correo_inversionista, Telefono_iversionista, Cedula_inversionista, Contrasena_inversionista, Contrasena_inversionista);
	if(inversioDao.Crear_Inversionista(inversioDto)) {
//		JOptionPane.showMessageDialog(null, "Clientes Registrado Exitosamente.");
		response.sendRedirect("clientes.jsp?men= Inversionista Registrado Exitosamente.");
	}else {
//		JOptionPane.showMessageDialog(null, "El Cliente no se Registro.");
		response.sendRedirect("clientes.jsp?men=El Inversionista no se Registro.");
	}
	}
	
	if(request.getParameter("buscar")!=null) {
		 
		String Nombre_inversionista,Apellido_inversionista,Correo_inversionista,Telefono_iversionista,Cedula_inversionista,Contrasena_inversionista, Fotos_inversionista;
		
		Cedula_inversionista=request.getParameter("cedula");
		inversionistaDTO Buscadto=inversioDao.Buscar_Inversionista(Cedula_inversionista);
		if(Buscadto!=null) {
		Cedula_inversionista=Buscadto.getCedula_inversionista();
		Nombre_inversionista= Buscadto.getNombre_inversionista();
		Correo_inversionista = Buscadto.getCorreo_inversionista();
		Telefono_iversionista= Buscadto.getTelefono_iversionista();
		Contrasena_inversionista=Buscadto.getContrasena_inversionista();
		Fotos_inversionista=Buscadto.getFotos_inversionista();
		
		response.sendRedirect("inversionista.jsp?cedula="+Cedula_inversionista+"&&direccion="+direccion+"&&correo="
		+correo+"&&nombre="+nombre+"&&telefono="+telefono);
}else {
	response.sendRedirect("clientes.jsp?men=El cliente no existe");
}
	}
	if(request.getParameter("actualizar")!=null) {
		String cedula_cliente,nombre,correo,direccion,telefono;
		
		cedula_cliente = request.getParameter("cedula");
		direccion = request.getParameter("direccion");
		   correo= request.getParameter("correo");
		nombre = request.getParameter("nombre");	
		telefono=request.getParameter("telefono");
		
		inversionistaDTO clientDto_Act = new inversionistaDTO(cedula_cliente,direccion,correo,nombre,telefono);
		if(clientDao.Actualizar_Cliente(clientDto_Act)) {
	//	JOptionPane.showMessageDialog(null, "Cliente se Actualizo Exitosamente.");
			response.sendRedirect("clientes.jsp?men=Cliente Actualizado Exitosamente.");
		}else {
	//	JOptionPane.showMessageDialog(null, "El Cliente no se Modifico.");
			response.sendRedirect("clientes.jsp?men=El Cliente no se Modifico.");
		}
		}
		
		
	if (request.getParameter("borrar")!=null) {
			
			String cedula_cliente;
			cedula_cliente=request.getParameter("cedula");
			
			int op = 0;
			//	int op=JOptionPane.showConfirmDialog(null, "Desea eliminar el Cliente de la :"+cedula_cliente);
			if(op==0) {
			if(clientDao.Eliminar_Cliente(cedula_cliente)) {
				response.sendRedirect("clientes.jsp?men=Usuario Eliminado");
				
			}else {
				response.sendRedirect("clientes.jsp?men=Usuario no se Eliminó");

			}
			
			
		}else {
			response.sendRedirect("clientes.jsp");

		}
		
		
		
	}
		
	}
		
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	