package ejercicio3;

public class Pizza {
	
	    private String tipo;
	    private String tamaño;
	    private boolean servida;

	    public Pizza(String tipo, String tamaño) {
	        this.tipo = tipo;
	        this.tamaño = tamaño;
	        this.servida = false; // por defecto no servida
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isServida() {
	        return servida;
	    }

	    public void servir() {
	        servida = true;
	    }

	    
	    public String toString() {
	        return "Pizza " + tipo + " (" + tamaño + ") - " +
	               (servida ? "Servida" : "Pedida");
	    }
	}
