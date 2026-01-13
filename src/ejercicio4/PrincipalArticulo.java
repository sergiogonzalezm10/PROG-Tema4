package ejercicio4;

import java.util.Random;

public class PrincipalArticulo {

	public static void main(String[] args) {

		Random rd1 = new Random();
		int numeroAleatorio = rd1.nextInt(100);
		Random rd2 = new Random();
		int numeroAleatorio2 = rd2.nextInt(100);
		 
		Articulo articulo1 = new Articulo();
		articulo1.nombre = "Portátil";
		articulo1.precio = 800.00;
		articulo1.unidades = numeroAleatorio;
		Articulo articulo2 = new Articulo();
		articulo2.nombre = "Ratón";
		articulo2.precio = 20.00;
		articulo2.unidades = numeroAleatorio2;
		double total1;
		double total2;
		total1 = articulo1.precio + (articulo1.precio * articulo1.IVA / 100);
		total2 = articulo2.precio + (articulo2.precio * articulo2.IVA / 100);
		System.out.println("Artículo: " + articulo1.nombre + ", Precio sin IVA: " + articulo1.precio + 
				", Precio con IVA: " + total1 + ", Unidades: " + articulo1.unidades);
		System.out.println("Artículo: " + articulo2.nombre + ", Precio sin IVA: " + articulo2.precio + 
				", Precio con IVA: " + total2 + ", Unidades: " + articulo2.unidades);
	}

}
