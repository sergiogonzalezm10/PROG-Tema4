package ejercicio4;

import java.util.Scanner;

public class PrincipalDisco {

    public static void main(String[] args) {

    	// Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        // Llama a la clase GestorDiscos
        GestorDiscos gestor = new GestorDiscos();

        int opcion;

        // Do para que nos pregunte que deseamos hacer y llamar a aquellos métodos correspondientes
        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Disco");
            System.out.println("3. Borrar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.listarDiscos();
                    break;
                case 2:
                    gestor.nuevoDisco();
                    break;
                case 3:
                    gestor.borrarDisco();
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);

        // Cierre escáner
        sc.close();
    }
}
