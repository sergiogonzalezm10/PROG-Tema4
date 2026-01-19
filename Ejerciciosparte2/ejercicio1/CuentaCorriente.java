package ejercicio1;

public class CuentaCorriente {
	
	public enum Nacionalidad {
        ESPANOLA, EXTRANJERA
    }
private String DNI;
private String nombre;
private double saldo;
private Nacionalidad nacionalidad;

public CuentaCorriente(String DNI, double saldo) {
	this.DNI = DNI;
	this.saldo = saldo;
	this.nombre = "Sin nombre";
	this.nacionalidad = nacionalidad.ESPANOLA;
}
}