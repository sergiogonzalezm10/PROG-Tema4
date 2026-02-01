package ejercicio2;

import java.util.Scanner;

import java.util.Scanner;

public class PrincipalArticulos {

    public static void main(String[] args) {

    	// Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        // Llama a la clase GestorArticulos
        GestorArticulos gestor = new GestorArticulos();
        int opcion;

        // Do para que nos pregunte que deseamos hacer y llamar a aquellos métodos correspondientes
        do {
            System.out.println("\nGESTISIMAL");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    gestor.listar();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("IVA: ");
                    int iva = sc.nextInt();
                    System.out.print("Unidades iniciales: ");
                    int unidades = sc.nextInt();

                    gestor.alta(new Articulo(nombre, precio, iva, unidades));
                    break;

                case 3:
                    System.out.print("Nombre del artículo: ");
                    if (!gestor.baja(sc.nextLine())) {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del artículo: ");
                    Articulo a = gestor.buscarPorNombre(sc.nextLine());
                    if (a != null) {
                        System.out.print("Nuevo precio: ");
                        a.setprecio(sc.nextDouble());
                        System.out.print("Nuevo IVA: ");
                        a.setIVA(sc.nextInt());
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Nombre del artículo: ");
                    a = gestor.buscarPorNombre(sc.nextLine());
                    if (a != null) {
                        System.out.print("Cantidad a añadir: ");
                        a.almacenar(sc.nextInt());
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Nombre del artículo: ");
                    a = gestor.buscarPorNombre(sc.nextLine());
                    if (a != null) {
                        System.out.print("Cantidad a vender: ");
                        if (!a.vender(sc.nextInt())) {
                            System.out.println("No hay suficientes unidades.");
                        }
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;
            }
            
        } while (opcion != 7);

        // Cierre escáner
        sc.close();
    }
}
