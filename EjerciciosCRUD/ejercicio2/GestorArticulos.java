package ejercicio2;

import java.util.ArrayList;

public class GestorArticulos {
	
	// Arraylist articulos
	private ArrayList<Articulo> articulos = new ArrayList<>();
	
	// Método para comprobar la lista de artículos en el almacén
	public void listar() {
		if (articulos.isEmpty()) {
			System.out.println("No hay artículos en el almacén");
		} else {
			for (Articulo a: articulos) {
				System.out.println(a);
			}
		}
	}
	
	// Método para almacenar un artículo
	public void alta(Articulo a) {
	articulos.add(a);
	}
	
	// Método para buscar un artículo por su nombre
	public Articulo buscarPorNombre(String nombre) {
		for (Articulo a: articulos) {
			if (a.getnombre().equalsIgnoreCase(nombre)) {
				return a;
			}
		}
		return null;
	}
	
	// Método para eliminar un artículo de la lista
	public boolean baja(String nombre) {
		Articulo a = buscarPorNombre(nombre);
		if (a != null) {
			articulos.remove(a);
			return true;
		}
		return false;	
	}
	}
