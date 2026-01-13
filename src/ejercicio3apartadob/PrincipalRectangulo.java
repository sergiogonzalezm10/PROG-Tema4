	package ejercicio3apartadob;
	
	public class PrincipalRectangulo {
	
		public static void main(String[] args) {
			Rectangulo r1 = new Rectangulo(0,0,5,5);
			Rectangulo r2 = new Rectangulo(1,2,2,4);
			
			int ancho1 = r1.puntoX2 - r1.puntoX1;
			int alto1 = r1.puntoY2 - r1.puntoY1;
			int perimetro1 = 2 * (ancho1 + alto1);
			int area1 = ancho1 * alto1;
			
			
			int ancho2 = r2.puntoX2 - r2.puntoX1;
			int alto2 = r2.puntoY2 - r2.puntoY1;
			int perimetro2 = 2 * (ancho2 + alto2);
			int area2 = ancho2 * alto2;
			
			System.out.println("Rectángulo 1: " + "( " + r1.puntoX1 + ", " + r1.puntoY1 + " ), ( " + r1.puntoX2 + ", " + r1.puntoY2 + " )");
			System.out.println("Rectangulo 2: " + "( " + r2.puntoX1 + ", " + r2.puntoY1 + " ), ( " + r2.puntoX2 + ", " + r2.puntoY2 + " )");
			
			System.out.println("Perímetro rectángulo 1: " + perimetro1);
			System.out.println("Área rectángulo 1: " + area1);
		
			System.out.println("Perímetro rectángulo 2: " + perimetro2);
			System.out.println("Área rectángulo 2: " + area2);
			
		}
	
	}
