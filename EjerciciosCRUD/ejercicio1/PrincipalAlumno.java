package ejercicio1;
import java.util.Scanner;

public class PrincipalAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorAlumnos gestor = new GestorAlumnos();
        int opcion;

        do {
            System.out.println("\nALUMNOS/AS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Alumno");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.listarAlumnos();
                    break;

                case 2:
                    System.out.print("Nombre del alumno: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    gestor.agregarAlumno(new Alumno(nombre, nota));
                    System.out.println("Alumno añadido correctamente.");
                    break;

                case 3:
                    System.out.print("Nombre del alumno a modificar: ");
                    String nombreModificar = sc.nextLine();
                    System.out.print("Nueva nota: ");
                    double nuevaNota = sc.nextDouble();
                    if (gestor.modificarNota(nombreModificar, nuevaNota)) {
                        System.out.println("Nota modificada correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del alumno a borrar: ");
                    String nombreBorrar = sc.nextLine();
                    if (gestor.borrarAlumno(nombreBorrar)) {
                        System.out.println("Alumno borrado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
