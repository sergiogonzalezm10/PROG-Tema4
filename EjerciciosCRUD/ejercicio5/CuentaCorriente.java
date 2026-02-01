package ejercicio5;

import java.util.Objects;

public class CuentaCorriente {

	// Creamos variables
    private String titular;
    private String dni;
    private String numeroCuenta;
    private double saldo;

    // Constructor completo
    public CuentaCorriente(String titular, String dni, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Constructor solo con DNI y titular (para búsqueda o creación rápida)
    public CuentaCorriente(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
        this.numeroCuenta = "0000"; // por defecto
        this.saldo = 0.0;
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método toString, para mostrar los datos de la cuenta
    public String toString() {
        return "Titular: " + titular +
               " | DNI: " + dni +
               " | Número: " + numeroCuenta +
               " | Saldo: " + saldo + " €";
    }

    // Compara cuentas por DNI
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuentaCorriente)) return false;
        CuentaCorriente c = (CuentaCorriente) o;
        return Objects.equals(dni, c.dni);
    }
}
