package actividad_3;
import java.util.Scanner;

public class Ejercicio_26 {
	public static final Scanner input=new Scanner(System.in);
/*
 * Realizá un programa que permita al usuario ingresar un 
 * número natural n. La computadora debe mostrar los primeros
 * n múltiplos de 3 excepto aquellos que sean a la vez múltiplos 
 * de 5.
 */
	public static void main(String[] args) {
		int n = 0;
		final int NUMERO_A_MULTIPLICAR = 3;
		System.out.println("Ingrese un numero natural: ");
		n = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= n; i++) {
			boolean esMultiploDe5 = i % 5 == 0;
			if (!esMultiploDe5) {
				System.out.println(NUMERO_A_MULTIPLICAR + " x " + i + " = " + NUMERO_A_MULTIPLICAR * i);				
			}
		}

	}

}
