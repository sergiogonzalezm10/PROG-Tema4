package ejercicio2;

import java.util.ArrayList;

public class GestorArticulos {
	private ArrayList<Articulo> articulos = new ArrayList<>();
	
	public void listar() {
		if (articulos.isEmpty()) {
			System.out.println("No hay artículos en el almacén");
		} else {
			for (Articulo a: articulos) {
				System.out.println(a);
			}
		}
	}
	public void alta(Articulo a) {
	articulos.add(a);
	}
	
	public Articulo buscarPorNombre(String nombre) {
		for (Articulo a: articulos) {
			if (a.getnombre().equalsIgnoreCase(nombre)) {
				return a;
			}
		}
		return null;
	}
	public boolean baja(String nombre) {
		Articulo a = buscarPorNombre(nombre);
		if (a != null) {
			articulos.remove(a);
			return true;
		}
		return false;	
	}
	}
