package ejercicio3apartadod;

public class PrincipalRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(1, 2, 2, 4);

        mostrar(r1, "Rectángulo 1");
        mostrar(r2, "Rectángulo 2");

        
        r1.setX1Y1(2, 2);
        r1.setX2Y2(6, 6);

        System.out.println("Después de modificar r1:");
        mostrar(r1, "Rectángulo 1");
    }

    static void mostrar(Rectangulo r, String nombre) {
        System.out.println("Nombre: " + nombre);
        System.out.println(r.toString());
        System.out.println("- Perímetro: " + r.getPerimetro());
        System.out.println("- Área: " + r.getArea());
        System.out.println();
    }
}
