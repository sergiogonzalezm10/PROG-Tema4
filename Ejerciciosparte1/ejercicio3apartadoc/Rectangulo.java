package ejercicio3apartadoc;

public class Rectangulo {
private int puntoX1;
public int getpuntoX1() {
	return puntoX1;
}

private int puntoY1;
public int getpuntoY1() {
	return puntoY1;
}

private int puntoX2;
public int getpuntoX2() {
	return puntoX2;
}

private int puntoY2;
public int getpuntoY2() {
	return puntoY2;
}

public void setpuntoX1 ( int puntoX1) {
	this.puntoX1 = puntoX1;
}

public void setpuntoX2 ( int puntoX2) {
	this.puntoX1 = puntoX2;
}

public void setpuntoY1 ( int puntoY1) {
	this.puntoY1 = puntoY1;
}

public void setpuntoY2 ( int puntoY2) {
	this.puntoY2 = puntoY2;
}

public void getPerimetro() {
	int ancho = puntoX2 - puntoX1;
	int alto = puntoY2 - puntoY1;
	int perimetro = 2 * ( ancho + alto );
	System.out.println("El perímetro del rectángulo es: " + perimetro);
}

public void getArea() {
	int ancho = puntoX2 - puntoX1;
	int alto = puntoY2 - puntoY1;
	int area = ancho * alto;
	System.out.println("El área del rectángulo es: " + area);
	}

public String toString() {
	return "Rectángulo[(" + puntoX1 + ", " + puntoY1 + "), (" + puntoX2 + ", " + puntoY2 + ")]";
}
Rectangulo(int x1, int y1, int x2, int y2){
	if ( x2 > x1 && y2 > y1 ) {
		setpuntoX1(x1);
		setpuntoY1(y1);
		setpuntoX2(x2);
		setpuntoY2(y2);
	} else {
		System.out.println("Error: Las coordenadas no forman un rectángulo válido.");
	}
}
}