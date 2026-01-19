package ejercicio3apartadob;

public class Rectangulo {
int puntoX1;
int puntoY1;
int puntoX2;
int puntoY2;

Rectangulo(int x1, int y1, int x2, int y2){
	if ( x2 > x1 && y2 > y1 ) {
		this.puntoX1 = x1;
		this.puntoY1 = y1;
		this.puntoX2 = x2;
		this.puntoY2 = y2;
	} else {
		System.out.println("Error: Las coordenadas no forman un rectángulo válido.");
	}
}
}