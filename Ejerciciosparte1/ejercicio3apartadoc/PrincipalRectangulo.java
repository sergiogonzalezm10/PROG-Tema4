	package ejercicio3apartadoc;
	
	public class PrincipalRectangulo {
	
		public static void main(String[] args) {
			Rectangulo r1 = new Rectangulo(0,0,5,5);
			Rectangulo r2 = new Rectangulo(1,2,2,4);
		
			mostrar(r1);
			mostrar(r2);
			
			MostrarResultado(r1, "Rectángulo 1");
			MostrarResultado(r2,"Rectángulo 2");
		}
		
	static void mostrar(Rectangulo r) {
		System.out.println("(" + r.getpuntoX1() + " , " + r.getpuntoY1() + " , " + r.getpuntoX2() + " , " + r.getpuntoY2() + ")");
	}
	
	static int base(Rectangulo r) {
		return Math.abs(r.getpuntoX2() - r.getpuntoX1());
	}
	
	static int altura(Rectangulo r) {
		return Math.abs(r.getpuntoY2() - r.getpuntoY1());
	}
	
	static int perimetro(Rectangulo r) {
		return 2 * (base(r)) + (altura(r));
	}
	
	static int area(Rectangulo r) {
		return (base(r)) * (altura(r));
	}
	
	static void MostrarResultado(Rectangulo r, String nombre) {
		System.out.println("Nombre: " + nombre);
		System.out.println("- Base: " + base(r) );
		System.out.println("- Altura: " + altura(r));
		System.out.println("- Perímetro: " + perimetro(r));
		System.out.println("- Area: " + area(r));
	}
	}
