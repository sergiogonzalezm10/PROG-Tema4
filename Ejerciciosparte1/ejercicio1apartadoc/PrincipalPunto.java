package ejercicio1apartadoc;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		//Creamos tres objetos de la clase Punto
		Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        

        mostrar(p1);
        mostrar(p2);
        mostrar(p3);
        
        p1.setx(p1.getx() + 2);
        p1.sety(p1.gety() - 1);
        
        mostrar(p1);
        
	}
	
        static void mostrar(Punto p) {
        	System.out.println( "---------------------------------" );
        	System.out.println("(" + p.getx() + "," + p.gety() + ")");
        	System.out.println( "---------------------------------" );
        }
    }

