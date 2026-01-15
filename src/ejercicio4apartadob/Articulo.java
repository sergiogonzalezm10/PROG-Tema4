package ejercicio4apartadob;

public class Articulo {
    String nombre ="Sin nombre";
    double precio = 0.0;
    int IVA = 21;
    int unidades = 0;

    // Constructor con parámetros
    public Articulo(String nombre, double precio, int IVA ,int unidades) {

    	if (!nombre.isBlank()) {	
    		this.nombre = nombre;
    	}
    	if ( precio > 0) {
    		this.precio = precio;
    	}
    	if ( IVA >= 0 && IVA < 100 ) {
    		this.IVA = IVA;
    	}
    	if (unidades > 0) {
    		this.unidades = unidades;
    	}
    }
}
