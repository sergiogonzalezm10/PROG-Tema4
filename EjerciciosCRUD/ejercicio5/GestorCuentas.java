package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorCuentas {

	// Arraylist cuentas
    private ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
    
    // Inicio escáner
    private Scanner sc = new Scanner(System.in);

    
    // Listar todas las cuentas
    public void listarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            for (CuentaCorriente c : cuentas) {
                System.out.println(c);
            }
        }
    }

    // Crear una nueva cuenta
    public void nuevaCuenta() {
        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Número de cuenta: ");
        String numero = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        CuentaCorriente c = new CuentaCorriente(titular, dni, numero, saldo);
        cuentas.add(c);

        System.out.println("Cuenta añadida.");
    }

    // Borrar cuenta por DNI
    public void borrarCuenta() {
        System.out.print("DNI del titular a borrar: ");
        String dni = sc.nextLine();

        CuentaCorriente borrar = null;

        for (CuentaCorriente c : cuentas) {
            if (c.getDni().equals(dni)) {
                borrar = c;
                break;
            }
        }

        if (borrar != null) {
            cuentas.remove(borrar);
            System.out.println("Cuenta eliminada.");
        } else {
            System.out.println("No se encontró ninguna cuenta con ese DNI.");
        }
    }

    // Modificar saldo de la cuenta (depósito o retiro)
    public void actualizarSaldo() {
        System.out.print("DNI del titular: ");
        String dni = sc.nextLine();

        CuentaCorriente c = null;
        for (CuentaCorriente cuenta : cuentas) {
            if (cuenta.getDni().equals(dni)) {
                c = cuenta;
                break;
            }
        }

        if (c != null) {
            System.out.print("Nuevo saldo: ");
            double nuevoSaldo = sc.nextDouble();
            sc.nextLine();
            c.setSaldo(nuevoSaldo);
            System.out.println("Saldo actualizado.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}
