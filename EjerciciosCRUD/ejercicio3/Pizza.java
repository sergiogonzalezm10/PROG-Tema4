package ejercicio3;

public class Pizza {
	
		// Creamos variables
	    private String tipo;
	    private String tamaño;
	    private boolean servida;

	    // Constructor Pizza
	    public Pizza(String tipo, String tamaño) {
	        this.tipo = tipo;
	        this.tamaño = tamaño;
	        this.servida = false; // por defecto no servida
	    }

	    // Getters y Setters
	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isServida() {
	        return servida;
	    }

	    public void servir() {
	        servida = true;
	    }

	    // Método toString, para mostrar datos del pedido
	    public String toString() {
	        return "Pizza " + tipo + " (" + tamaño + ") - " +
	               (servida ? "Servida" : "Pedida");
	    }
	}
