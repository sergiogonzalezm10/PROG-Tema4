package ejercicio2apartadob;

import java.util.Scanner;

public class PrincipalPersona {

    public static void main(String[] args) {
    	
    	//Inicio escáner
        Scanner sc = new Scanner(System.in);

        // Pedir datos de la primera persona
        System.out.print("DNI persona 1: ");
        String dni1 = sc.nextLine();
        System.out.print("Nombre persona 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellidos persona 1: ");
        String apellidos1 = sc.nextLine();
        System.out.print("Edad persona 1: ");
        int edad1 = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        // Crear objeto usando constructor
        Persona p1 = new Persona(dni1, nombre1, edad1, apellidos1);

        // Pedir datos de la segunda persona
        System.out.print("DNI persona 2: ");
        String dni2 = sc.nextLine();
        System.out.print("Nombre persona 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Apellidos persona 2: ");
        String apellidos2 = sc.nextLine();
        System.out.print("Edad persona 2: ");
        int edad2 = sc.nextInt();

        // Crear objeto usando constructor
        Persona p2 = new Persona(dni2, nombre2, edad2, apellidos2);

        // Mostrar resultados
        System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI +
                (p1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI +
                (p2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        //Cierre escáner
        sc.close();
    }
}

