package actividad_3;
import java.util.Scanner;

public class Ejercicio_25 {
	public static final Scanner input=new Scanner(System.in);
	/*
	 * 25. Realizá un programa que permita ingresar dos números 
	 * enteros que representen el ancho y el alto de una matriz 
	 * de cruces. El programa debe dibujar dicha matriz.
	 */
	public static void main(String[] args) {
		int alto=0, ancho=0;
		System.out.println("Ingrese el alto: ");
		alto=input.nextInt();
		System.out.println("Ingrese el ancho: ");
		ancho=input.nextInt();

		for(int i=0; i < alto; i++) {
			for(int j=0; j<ancho; j++) { 
				System.out.print("X"); 
			} 
			System.out.println();
		}
	}

}
