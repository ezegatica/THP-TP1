package actividad_2;
import java.util.Scanner;

public class Ejercicio_11 {
	private static Scanner input = new Scanner(System.in);
/*
 * Realizá un programa que permita ingresar un número entero e indique si se trata de un                              
número par o impar. [EC]
 */
	
	public static void main(String[] args) {
		int num = 0;
		System.out.println("Ingrese un numero entero: ");
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("El numero es pár!");
		} else {
			System.out.println("El numero es impár!");
		}
		
	}

}
