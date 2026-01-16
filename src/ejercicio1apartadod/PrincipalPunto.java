package ejercicio1apartadod;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		//Creamos tres objetos de la clase Punto
		Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        

        mostrar(p1);
        mostrar(p2);
        mostrar(p3);
        
        p1.setXY(7, -1);
        System.out.println("Después de setXY: " + p1);

        // Probamos desplaza
        p2.desplaza(-2, 3);
        System.out.println("Después de desplaza: " + p2);

        // Probamos distancia
        double d = p1.distancia(p3);
        System.out.println("Distancia entre " + p1 + " y " + p3 + " = " + d);
        
	}
	
        static void mostrar(Punto p) {
        	System.out.println( "---------------------------------" );
        	System.out.println("(" + p.getx() + "," + p.gety() + ")");
        	System.out.println( "---------------------------------" );
        }
    }

