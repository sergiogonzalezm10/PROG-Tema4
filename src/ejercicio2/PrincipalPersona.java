package ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        // Datos primera persona
        System.out.print("DNI persona 1: ");
        p1.DNI = sc.nextLine();    
        System.out.print("Nombre persona 1: ");
        p1.nombre = sc.nextLine();
        System.out.print("Apellidos persona 1: ");
        p1.apellidos = sc.nextLine();
        System.out.print("Edad persona 1: ");
        p1.edad = sc.nextInt();
        sc.nextLine();

        // Datos segunda persona
        System.out.print("DNI persona 2: ");
        p2.DNI = sc.nextLine();
        System.out.print("Nombre persona 2: ");
        p2.nombre = sc.nextLine();
        System.out.print("Apellidos persona 2: ");
        p2.apellidos = sc.nextLine();
        System.out.print("Edad persona 2: ");
        p2.edad = sc.nextInt();

        // Mostrar resultados
        System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI +
                (p1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI +
                (p2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        sc.close();
    }
}
