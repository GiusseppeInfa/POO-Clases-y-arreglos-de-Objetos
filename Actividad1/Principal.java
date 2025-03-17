package Actividad1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese coordenadas del primer rectángulo (x1 x2 y1 y2):");
        Rectangulo A = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));

        System.out.println("Ingrese coordenadas del segundo rectángulo (x1 x2 y1 y2):");
        Rectangulo B = new Rectangulo(new Coordenada(sc.nextDouble(), sc.nextDouble()),
                                      new Coordenada(sc.nextDouble(), sc.nextDouble()));
        
        System.out.println("Rectangulo A = " + A);
        System.out.println("Rectangulo B = " + B);
            
        if (Verificador.esSobrePos(A, B)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            double area = A.calculoAreaSobreposicion(B);
            System.out.printf("Área de sobreposición = %.2f\033[0m\n", area);
        } else if (Verificador.esJunto(A, B)) {
            System.out.println("Rectángulos A y B están juntos.");
        } else if (Verificador.esDisjunto(A, B)) {
            System.out.println("Rectángulos A y B son disjuntos.");
        }
        sc.close();  
    }
}
