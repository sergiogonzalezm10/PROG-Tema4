	package ejercicio1apartadod;
	
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
	    
	    public void setXY(int x, int y) {
	    	this.x = x;
	    	this.y = y;
	    }
	    
	    public void desplaza(int dx,int dy) {
	    	this.x += dx;
	        this.y += dy;
	    }
	    public double distancia(Punto p) {
	    	int dx = this.x - p.x;
	    	int dy = this.y - p.y;
	    	return Math.sqrt(dx * dx + dy * dy);
	    }
	    public String toString() {
	    	return "(" + x + ", " + y + ")";
	    }
	}
	