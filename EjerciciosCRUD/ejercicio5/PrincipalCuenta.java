	package ejercicio5;

	import java.util.Scanner;

	public class PrincipalCuenta {

	    public static void main(String[] args) {

	    	// Inicio escáner
	        Scanner sc = new Scanner(System.in);
	        
	        // Llama a la clase GestorCuentas
	        GestorCuentas gestor = new GestorCuentas();

	        int opcion;

	        // Do para que nos pregunte que deseamos hacer y llamar a aquellos métodos correspondientes
	        do {
	            System.out.println("\nGESTIÓN DE CUENTAS CORRIENTES");
	            System.out.println("============================");
	            System.out.println("1. Listar cuentas");
	            System.out.println("2. Crear nueva cuenta");
	            System.out.println("3. Borrar cuenta");
	            System.out.println("4. Actualizar saldo");
	            System.out.println("5. Salir");
	            System.out.print("Opción: ");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1:
	                    gestor.listarCuentas();
	                    break;
	                case 2:
	                    gestor.nuevaCuenta();
	                    break;
	                case 3:
	                    gestor.borrarCuenta();
	                    break;
	                case 4:
	                    gestor.actualizarSaldo();
	                    break;
	                case 5:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida");
	            }

	        } while (opcion != 5);

	        //Cierre escáner
	        sc.close();
	    }
	}