package ejercicio3;

import java.util.Scanner;

public class PrincipalPizza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorPizzas gestor = new GestorPizzas();
        int opcion;

        do {
            System.out.println("\nPIZZAS");
            System.out.println("1. Listado de pizzas");
            System.out.println("2. Nuevo pedido");
            System.out.println("3. Pizza servida");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    gestor.listar();
                    break;

                case 2:
                    System.out.print("Tipo de pizza: ");
                    String tipo = sc.nextLine();
                    System.out.print("Tamaño: ");
                    String tamaño = sc.nextLine();
                    gestor.añadir(new Pizza(tipo, tamaño));
                    break;

                case 3:
                    System.out.print("Tipo de pizza servida: ");
                    Pizza p = gestor.buscarPendiente(sc.nextLine());
                    if (p != null) {
                        p.servir();
                        System.out.println("Pizza servida.");
                    } else {
                        System.out.println("No hay pizzas pendientes de ese tipo.");
                    }
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}