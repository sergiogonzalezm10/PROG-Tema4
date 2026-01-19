package ejercicio3apartadod;

public class Rectangulo {

    private int puntoX1;
    private int puntoY1;
    private int puntoX2;
    private int puntoY2;


    public int getpuntoX1() {
        return puntoX1;
    }

    public int getpuntoY1() {
        return puntoY1;
    }

    public int getpuntoX2() {
        return puntoX2;
    }

    public int getpuntoY2() {
        return puntoY2;
    }

 
    public void setpuntoX1(int puntoX1) {
        this.puntoX1 = puntoX1;
    }

    public void setpuntoY1(int puntoY1) {
        this.puntoY1 = puntoY1;
    }

    public void setpuntoX2(int puntoX2) {
        this.puntoX2 = puntoX2;
    }

    public void setpuntoY2(int puntoY2) {
        this.puntoY2 = puntoY2;
    }

 
    public void setX1Y1(int x1, int y1) {
        this.puntoX1 = x1;
        this.puntoY1 = y1;
    }

    public void setX2Y2(int x2, int y2) {
        this.puntoX2 = x2;
        this.puntoY2 = y2;
    }

    
    public void setAll(int x1, int y1, int x2, int y2) {
        if (x2 > x1 && y2 > y1) {
            this.puntoX1 = x1;
            this.puntoY1 = y1;
            this.puntoX2 = x2;
            this.puntoY2 = y2;
        } else {
            System.out.println("Error: Las coordenadas no forman un rectángulo válido.");
        }
    }

    
    public int getPerimetro() {
        int ancho = Math.abs(puntoX2 - puntoX1);
        int alto = Math.abs(puntoY2 - puntoY1);
        return 2 * (ancho + alto);
    }

    public int getArea() {
        int ancho = Math.abs(puntoX2 - puntoX1);
        int alto = Math.abs(puntoY2 - puntoY1);
        return ancho * alto;
    }

    
    public String toString() {
        return "Rectángulo[(" + puntoX1 + ", " + puntoY1 + "), (" + puntoX2 + ", " + puntoY2 + ")]";
    }

    
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setAll(x1, y1, x2, y2);
    }
}
