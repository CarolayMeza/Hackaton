Create database Hackathon;

use Hackathon;

Create Table Inversionista(
Id_inversionista int(6) Primary key auto_increment,
Nombre_inversionista varchar(25) not null,
Apellido_inversionista varchar (20) not null,
Correo_inversionitas varchar(30) not null,
Telefono_inversionista varchar(10)not null,
Cedula_inversionista varchar(10)not null,
Contraseña_inversionista varchar(15) not null,
Fotos_inversionista varchar(200)
);

Create table Campesino(
Id_campesino int(6) Primary key auto_increment,
Nombre_campesino varchar(25) not null,
Apellido_campesino varchar (20) not null,
Correo_campesino varchar(30) not null,
Telefono_campesino varchar(10)not null,
Cedula_campesino varchar(10)not null,
Contraseña_campesino varchar (15) not null,
Fotos_campesino varchar(200)
);