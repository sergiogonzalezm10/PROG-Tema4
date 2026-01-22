package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorAlumnos {

    private ArrayList<Alumno> alumnos;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    // CREATE
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // READ
    public void listarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a);
            }
        }
    }

    // UPDATE (solo la nota)
    public boolean modificarNota(String nombre, double nuevaNota) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.setNota(nuevaNota);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean borrarAlumno(String nombre) {
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
