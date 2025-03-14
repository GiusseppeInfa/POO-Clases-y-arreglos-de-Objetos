package Actividad1;

import java.util.*;

public class Coordenada {
	int x;
	int y;
	
	public Coordenada(int n, int m) {
		this.x = n;
		this.y = m;	
	};
	
	public Coordenada() {};
	
	public Coordenada(Coordenada c) {   //Elemento tipo Coordenada
		this.x = c.x;
		this.y = c.y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	};
	
	public double distancia(Coordenada c) {
		
	};
	
	public static double distancia(Coordenada c1, Coordenada c2) {
		
	};
	
	public String toString() {
		return this.x + this.y;
	}
	
	
	
	
	
}
