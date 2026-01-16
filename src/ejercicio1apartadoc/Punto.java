	package ejercicio1apartadoc;
	
	public class Punto {
		//Variables de las coordenadas
		private int x;
		public int getx() {
			return x;
		}
		
		public void setx(int x) {
			this.x = x;
		}
		
	    private int y;
	    public int gety() {
	    	return y;
	    };
	    
	    public void sety(int y) {
	    	this.y = y;
	    }
	    //Constructor de la clase
	    Punto(int x, int y) {
	       setx(x);
	       sety(y);
	    }
	}	