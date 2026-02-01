package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDiscos {

    // Arraylist coleccion
    private ArrayList<Disco> coleccion = new ArrayList<>();
   
    // Inicio escáner
    Scanner sc = new Scanner(System.in);
    
    // Lista de todos los discos
    public void listarDiscos() {
        if (coleccion.isEmpty()) {
            System.out.println("No hay discos en la colección.");
        } else {
            for (Disco d : coleccion) {
                System.out.println(d);
            }
        }
    }

    // Pide datos y crea un disco nuevo
    public void nuevoDisco() {
        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Duración: ");
        int duracion = sc.nextInt();
        sc.nextLine();

        Disco.Genero genero = null;
        boolean valido = false;

        // Comprueba que el género sea correcto
        while (!valido) {
            System.out.print("Género (ROCK, POP, JAZZ, BLUES): ");
            try {
                genero = Disco.Genero.valueOf(sc.nextLine().toUpperCase());
                valido = true;
            } catch (Exception e) {
                System.out.println("Género incorrecto.");
            }
        }

        Disco nuevo = new Disco(codigo, autor, titulo, duracion, genero);
        coleccion.add(nuevo);

        System.out.println("Disco añadido.");
    }

    // Borra un disco por su código
    public void borrarDisco() {
        System.out.print("Código del disco a borrar: ");
        String codigo = sc.nextLine();

        Disco borrar = null;

        for (Disco d : coleccion) {
            if (d.getCodigo().equals(codigo)) {
                borrar = d;
                break;
            }
        }

        if (borrar != null) {
            coleccion.remove(borrar);
            System.out.println("Disco eliminado.");
        } else {
            System.out.println("No se encontró el disco.");
        }
    }
}
