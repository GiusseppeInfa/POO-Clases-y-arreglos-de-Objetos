package Actividad1;

public class Verificador {
	

	public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
		
		return !(r1.getEsquina1().getX() >= r2.getEsquina2().getX() || // r1 está a la derecha de r2
                r1.getEsquina2().getX() <= r2.getEsquina1().getX() || // r1 está a la izquierda de r2
                r1.getEsquina1().getY() >= r2.getEsquina2().getY() || // r1 está debajo de r2
                r1.getEsquina2().getY() <= r2.getEsquina1().getY());
	};
	
    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        boolean horizontalTouch = (r1.getEsquina2().getX() == r2.getEsquina1().getX() || 
                                   r1.getEsquina1().getX() == r2.getEsquina2().getX()) &&
                                  !(r1.getEsquina2().getY() <= r2.getEsquina1().getY() || 
                                    r1.getEsquina1().getY() >= r2.getEsquina2().getY());

        boolean verticalTouch = (r1.getEsquina2().getY() == r2.getEsquina1().getY() || 
                                 r1.getEsquina1().getY() == r2.getEsquina2().getY()) &&
                                !(r1.getEsquina2().getX() <= r2.getEsquina1().getX() || 
                                  r1.getEsquina1().getX() >= r2.getEsquina2().getX());

        return (horizontalTouch || verticalTouch) && !esSobrePos(r1, r2);
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}
