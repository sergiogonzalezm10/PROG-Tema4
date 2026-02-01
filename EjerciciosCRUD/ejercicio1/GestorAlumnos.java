package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorAlumnos {
	
	// Arraylist alumnos
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    // Crea los alumnos
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Lee los alumnos creados anteriormente
    public void listarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a);
            }
        }
    }

    // Actualiza la nota del alumno escogido
    public boolean modificarNota(String nombre, double nuevaNota) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.setNota(nuevaNota);
                return true;
            }
        }
        return false;
    }

    // Borrar alumno
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
