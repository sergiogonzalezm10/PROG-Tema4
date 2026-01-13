package ejercicio4apartadob;

import java.util.Random;

public class PrincipalArticulo {

    public static void main(String[] args) {

        Random rd = new Random();
        int numeroAleatorio1 = rd.nextInt(100);
        int numeroAleatorio2 = rd.nextInt(100);

        // Crear artículos usando el constructor
        Articulo articulo1 = new Articulo("Portátil", 800.00, numeroAleatorio1);
        Articulo articulo2 = new Articulo("Ratón", 20.00, numeroAleatorio2);

        // Crear artículo con datos incorrectos
        Articulo articulo3 = new Articulo("", -50, -10); // valores inválidos, se usarán los por defecto

        // Calcular precio con IVA
        double total1 = articulo1.precio + (articulo1.precio * articulo1.IVA / 100);
        double total2 = articulo2.precio + (articulo2.precio * articulo2.IVA / 100);
        double total3 = articulo3.precio + (articulo3.precio * articulo3.IVA / 100);

        // Mostrar resultados
        System.out.println("Artículo: " + articulo1.nombre + ", Precio sin IVA: " + articulo1.precio + 
                ", Precio con IVA: " + total1 + ", Unidades: " + articulo1.unidades);

        System.out.println("Artículo: " + articulo2.nombre + ", Precio sin IVA: " + articulo2.precio + 
                ", Precio con IVA: " + total2 + ", Unidades: " + articulo2.unidades);

        System.out.println("Artículo: " + articulo3.nombre + ", Precio sin IVA: " + articulo3.precio + 
                ", Precio con IVA: " + total3 + ", Unidades: " + articulo3.unidades);
    }
}

