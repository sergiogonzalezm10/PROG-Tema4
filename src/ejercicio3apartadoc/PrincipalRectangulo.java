	package ejercicio3apartadoc;
	
	public class PrincipalRectangulo {
	
		public static void main(String[] args) {
			Rectangulo r1 = new Rectangulo(0,0,5,5);
			Rectangulo r2 = new Rectangulo(1,2,2,4);
		
			mostrar(r1);
			mostrar(r2);
			
		}
	static void mostrar(Rectangulo r) {
		System.out.println("(" + r.getpuntoX1() + " , " + r.getpuntoY1() + " , " + r.getpuntoX2() + " , " + r.getpuntoY2() + ")");
	}
	}
