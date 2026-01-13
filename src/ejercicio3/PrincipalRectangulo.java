package ejercicio3;

public class PrincipalRectangulo {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        int  perimetro1;
        int perimetro2;
        int ancho1;
        int ancho2;
        int alto1;
        int alto2;
        int area1;
        int area2;
        
        // Datos primer rectángulo
        r1.puntoX1 = 0;
        r1.puntoY1 = 5;
        r1.puntoX2 = 0;
        r1.puntoY2 = 5;
        
        // Datos segundo rectángulo
        r2.puntoX1 = 7;
        r2.puntoY1 = 9;
        r2.puntoX2 = 2;
        r2.puntoY2 = 3;

        // Mostrar resultados
        System.out.println("Rectángulo 1:" + "(" + r1.puntoX1 + ", " + r1.puntoY1 + ") (" +
                r1.puntoX2 + ", " + r1.puntoY2 + ")");
        System.out.println("Rectángulo 2:" + "(" + r2.puntoX1 + ", " + r2.puntoY1 + ") (" +
                r2.puntoX2 + ", " + r2.puntoY2 + ")");

        ancho1 = r1.puntoX2 - r1.puntoX1;
        alto1 = r1.puntoY2 - r1.puntoY1;
        perimetro1 = 2 * (ancho1 + alto1);
        
        ancho2 = r2.puntoX2 - r2.puntoX1;
        alto2 = r2.puntoY2 - r2.puntoY1;
        perimetro2 = 2 * (ancho2 + alto2);
        
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro1);
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro2);

        area1 = ancho1 * alto1;
        area2 = ancho2 * alto2;
        
        System.out.println("El área del rectángulo 1 es: " + area1);
        System.out.println("El área del rectángulo 2 es: " + area2);
    }

}
