package Modelo;

public class agricultorDTO {
   
  

   private String Nombre_campesino;
   private String Apellido_campesino;
   private String Correo_campesino;
   private String Telefono_campesino;
   private String Cedula_campesino;
   private String Contrasena_campesino;
   private String Fotos_campesino;



public agricultorDTO( String Nombre_campesino, String Apellido_campesino, String Correo_campesino, String Cedula_campesino, String Telefono_campesino,   String Contrasena_campesino, String Fotos_campesino) {
	

	this.Nombre_campesino = Nombre_campesino;
	this.Apellido_campesino = Apellido_campesino;
	this.Correo_campesino = Correo_campesino;
	this.Cedula_campesino = Cedula_campesino;
	this.Telefono_campesino = Telefono_campesino;
	this.Contrasena_campesino = Contrasena_campesino;
	this.Fotos_campesino = Fotos_campesino;
}



public agricultorDTO(String nombre_campesino, String apellido_campesino, String correo_campesino,
		String telefono_campesino, String cedula_campesino, String contrasena_campesino) {
	super();
	Nombre_campesino = nombre_campesino;
	Apellido_campesino = apellido_campesino;
	Correo_campesino = correo_campesino;
	Telefono_campesino = telefono_campesino;
	Cedula_campesino = cedula_campesino;
	Contrasena_campesino = contrasena_campesino;
}



public String getNombre_campesino() {
	return Nombre_campesino;
}



public void setNombre_campesino(String nombre_campesino) {
	Nombre_campesino = nombre_campesino;
}



public String getApellido_campesino() {
	return Apellido_campesino;
}



public void setApellido_campesino(String apellido_campesino) {
	Apellido_campesino = apellido_campesino;
}



public String getCorreo_campesino() {
	return Correo_campesino;
}



public void setCorreo_campesino(String correo_campesino) {
	Correo_campesino = correo_campesino;
}



public String getTelefono_campesino() {
	return Telefono_campesino;
}



public void setTelefono_campesino(String telefono_campesino) {
	Telefono_campesino = telefono_campesino;
}



public String getCedula_campesino() {
	return Cedula_campesino;
}



public void setCedula_campesino(String cedula_campesino) {
	Cedula_campesino = cedula_campesino;
}



public String getContrasena_campesino() {
	return Contrasena_campesino;
}



public void setContrasena_campesino(String contrasena_campesino) {
	Contrasena_campesino = contrasena_campesino;
}



public String getFotos_campesino() {
	return Fotos_campesino;
}



public void setFotos_campesino(String fotos_campesino) {
	Fotos_campesino = fotos_campesino;
}


}
  
