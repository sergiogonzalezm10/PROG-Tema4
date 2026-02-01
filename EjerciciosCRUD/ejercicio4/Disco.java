package ejercicio4;

import java.util.Objects;

public class Disco {

    // Enum para los géneros posibles
    public enum Genero {
        ROCK, POP, JAZZ, BLUES
    }

    // Atributos del disco
    private String codigo;
    private String autor;
    private String titulo;
    private int duracion;
    private Genero genero;

    // Constructor vacío
    public Disco() {
    }

    // Constructor con todos los datos
    public Disco(String codigo, String autor, String titulo, int duracion, Genero genero) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Método toString,para mostrar los datos del disco
    public String toString() {
        return "Código: " + codigo +
               " | Autor: " + autor +
               " | Título: " + titulo +
               " | Duración: " + duracion + " min" +
               " | Género: " + genero;
    }

    // Compara discos por su código
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disco)) return false;
        Disco d = (Disco) o;
        return Objects.equals(codigo, d.codigo);
    }
}
