package Actividad1;

public class Rectangulo {
	private Coordenada esquina1;
	private Coordenada esquina2;
	
	public Rectangulo(Coordenada c1, Coordenada c2) {
		setEsquina1(c1);
		setEsquina2(c2);
	}

	public Coordenada getEsquina1() {
		return this.esquina1;
	}

	public void setEsquina1(Coordenada esquina1) {
		this.esquina1 = esquina1;
	}

	public Coordenada getEsquina2() {
		return this.esquina2;
	}

	public void setEsquina2(Coordenada esquina2) {
		this.esquina2 = esquina2;
	}
	
	public double getXMin() { return Math.min(esquina1.getX(), esquina2.getX()); }
    public double getXMax() { return Math.max(esquina1.getX(), esquina2.getX()); }
    public double getYMin() { return Math.min(esquina1.getY(), esquina2.getY()); }
    public double getYMax() { return Math.max(esquina1.getY(), esquina2.getY()); }
    
    public double calculoArea() {
        return (getXMax() - getXMin()) * (getYMax() - getYMin());
    }
    
    public double calculoAreaSobreposicion(Rectangulo otro) {
        if (!Verificador.esSobrePos(this, otro)) return 0;
        double xSobre = Math.min(this.getXMax(), otro.getXMax()) - Math.max(this.getXMin(), otro.getXMin());
        double ySobre = Math.min(this.getYMax(), otro.getYMax()) - Math.max(this.getYMin(), otro.getYMin());
        return xSobre * ySobre;
    }
	
	public String toString() {
		return "[" + this.esquina1 + ", " + this.esquina2 + "]";
	}
}
