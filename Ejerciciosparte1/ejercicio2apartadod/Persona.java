package ejercicio2apartadod;

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

public boolean esMayorDeEdad() {
	if ( edad >= 18 ) {
		return true;
	} else {
		return false;
	}
}
public boolean esJubilado() {
	if ( edad >= 65 ) {
		return true;
	} else {
		return false;
	}
}
public int diferenciaEdad(Persona p) {
	return Math.abs(this.edad - p.edad);
}
public String toString() {
	return "DNI: " + DNI + " | Nombre: " + nombre + " | Apellidos: " + apellidos + " | Edad: " + edad;
}
}
