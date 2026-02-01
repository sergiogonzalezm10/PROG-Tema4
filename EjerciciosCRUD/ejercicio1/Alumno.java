package ejercicio1;

public class Alumno {

	// Creamos variables
    private String nombre;
    private double nota;

    // Constructor alumno
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método toString, mostrar datos del alumno
    public String toString() {
        return "Alumno: " + nombre + " | Nota: " + nota;
    }
}
