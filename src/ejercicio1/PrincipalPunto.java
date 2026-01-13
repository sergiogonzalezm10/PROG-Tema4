package ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		//Creamos tres objetos de la clase Punto
		Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        
        //Imprimimos las coordenadas de los puntos
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
        System.out.println("(" + p3.x + ", " + p3.y + ")");
		
        //Modificamos las coordenadas de los puntos
        p1.x += 2;
        p1.y -= 1;

        p2.x *= 2;
        p2.y = p2.y - 5;

        p3.x = -p3.x;
        p3.y += 3;

        //Imprimimos las nuevas coordenadas de los puntos
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
        System.out.println("(" + p3.x + ", " + p3.y + ")");
    }
}