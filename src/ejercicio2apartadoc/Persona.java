package ejercicio2apartadoc;

public class Persona {
	
private String DNI;
public String getDNI() {
	return DNI;
}

private String nombre;
public String getnombre() {
	return nombre;
}

private int edad;
public int edad() {
	return edad;
}

private String apellidos;
public String getapellidos() {
	return apellidos;
}

public void setDNI(String DNI) {
	this.DNI = DNI;
}

public void setnombre(String nombre) {
	this.nombre = nombre;
}

public void setedad(int edad) {
	this.edad = edad;
}

public void setapellidos(String apellidos) {
	this.apellidos = apellidos;
}

Persona(String DNI, String nombre, int edad, String apellidos){
	setDNI(DNI);
	setnombre(nombre);
	setedad(edad);
	setapellidos(apellidos);
}
}
