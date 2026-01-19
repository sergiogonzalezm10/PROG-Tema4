package ejercicio4apartadoc;

public class Articulo {
	
	private String nombre;
	public String getnombre() {
		return nombre;
	}

private double precio;
public double getprecio() {
	return precio;
}

private int IVA = 21;
public int getIVA() {
	return IVA;
}

private int unidades;
public int getunidades() {
	return unidades;
}

public void setnombre ( String nombre ) {
	if (!nombre.isBlank()) {	
		this.nombre = nombre;
	this.nombre = nombre;
	}
}
public void setprecio ( double precio) {
	if ( precio > 0) {
	this.precio = precio;
	}
}

public void setIVA ( int IVA) {
	if ( IVA >= 0 && IVA < 100 ) {
		this.IVA = IVA;
	}
}

public void setunidades ( int unidades ) {
	if (unidades > 0) {
		this.unidades = unidades;
	}
}


//Constructor con parámetros
public Articulo(String nombre, double precio, int IVA ,int unidades) {
	setnombre(nombre);
	setprecio(precio);
	setIVA(IVA);
	setunidades(unidades);
}
}
