package Actividad1;

public class Coordenada {
	private double x;
	private double y;
	
	public Coordenada() {
		this.x = 0;
		this.y = 0;
	};
	
	public Coordenada(double n, double m) {
		this.x = n;
		this.y = m;	
	};
	
	public Coordenada(Coordenada c) {   //Elemento tipo Coordenada
		this.x = c.x;
		this.y = c.y;
	}

	public double getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	};
	
	public double distancia(Coordenada c) {
		return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
	};
	
	public static double distancia(Coordenada c1, Coordenada c2) {
		return c1.distancia(c2);
	};
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}		
}
