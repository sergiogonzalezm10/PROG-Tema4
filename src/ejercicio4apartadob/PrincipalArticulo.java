package ejercicio4apartadob;

import java.util.Random;

public class PrincipalArticulo {

    public static void main(String[] args) {


        // Crear artículos usando el constructor
        Articulo articulo1 = new Articulo("Pijama", 10.0, 21, 21);
        Articulo articulo2 = new Articulo("", -20.00, 210, 0);
        
        mostrar(articulo1);
        mostrar(articulo2);
        
        articulo1.precio = -200;
        
        mostrar(articulo1);
    }
        static void mostrar(Articulo articulo) {
        	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        	System.out.println("Nombre: " + articulo.nombre + " | Precio: " + articulo.precio + "€ | IVA: " + articulo.IVA + "% | Unidades: " + articulo.unidades);
        	System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        }
    }

