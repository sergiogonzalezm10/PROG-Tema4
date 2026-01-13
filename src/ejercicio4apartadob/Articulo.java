package ejercicio4apartadob;

public class Articulo {
    String nombre = "Desconocido";
    double precio = 0.0;
    final int IVA = 21;
    int unidades = 0;

    // Constructor con parámetros
    public Articulo(String nombre, double precio, int unidades) {
        // Validar nombre
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
        // Validar precio
        if (precio >= 0) {
            this.precio = precio;
        }
        // Validar unidades
        if (unidades >= 0) {
            this.unidades = unidades;
        }
    }
}
