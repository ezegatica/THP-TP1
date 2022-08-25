package actividad_3;
import java.util.Scanner;

public class Ejercicio_23 {
	private static Scanner input = new Scanner(System.in);
/*
 * Realizá un programa que permita ingresar un número entero n. 
 * Debe mostrar los primeros 10 múltiplos de n (desde 1 x n).
 */
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Ingrese el numero n: ");
		n = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
