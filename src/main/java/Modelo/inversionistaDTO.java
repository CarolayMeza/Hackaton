package Modelo;

public class inversionistaDTO {
   private String Nombre_inversionista;
   private String Apellido_inversionista;
   private String Correo_inversionista;
   private String Telefono_iversionista;
   private String Cedula_inversionista;
   private String Contrasena_inversionista;
   private String Fotos_inversionista;



public inversionistaDTO(String nombre_inversionista, String apellido_inversionista, String correo_inversionista,
		String telefono_iversionista, String cedula_inversionista, String contrasena_inversionista,
		String fotos_inversionista) {
	
	this.Nombre_inversionista = nombre_inversionista;
	this.Apellido_inversionista = apellido_inversionista;
	this.Correo_inversionista = correo_inversionista;
	this.Telefono_iversionista = telefono_iversionista;
	this.Cedula_inversionista = cedula_inversionista;
	this.Contrasena_inversionista = contrasena_inversionista;
	this.Fotos_inversionista = fotos_inversionista;
}



public String getNombre_inversionista() {
	return Nombre_inversionista;
}



public void setNombre_inversionista(String nombre_inversionista) {
	Nombre_inversionista = nombre_inversionista;
}



public String getApellido_inversionista() {
	return Apellido_inversionista;
}



public void setApellido_inversionista(String apellido_inversionista) {
	Apellido_inversionista = apellido_inversionista;
}



public String getCorreo_inversionista() {
	return Correo_inversionista;
}



public void setCorreo_inversionista(String correo_inversionista) {
	Correo_inversionista = correo_inversionista;
}



public String getTelefono_iversionista() {
	return Telefono_iversionista;
}



public void setTelefono_iversionista(String telefono_iversionista) {
	Telefono_iversionista = telefono_iversionista;
}



public String getCedula_inversionista() {
	return Cedula_inversionista;
}



public void setCedula_inversionista(String cedula_inversionista) {
	Cedula_inversionista = cedula_inversionista;
}



public String getContrasena_inversionista() {
	return Contrasena_inversionista;
}



public void setContrasena_inversionista(String contrasena_inversionista) {
	Contrasena_inversionista = contrasena_inversionista;
}



public String getFotos_inversionista() {
	return Fotos_inversionista;
}



public void setFotos_inversionista(String fotos_inversionista) {
	Fotos_inversionista = fotos_inversionista;
}

}
