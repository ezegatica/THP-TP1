package actividad_3;
import java.util.Scanner;

public class Ejercicio_24 {
	private static Scanner input = new Scanner(System.in);
	/*
	 * 24. Realizá un programa que permita al usuario ingresar 
	 * dos números enteros num1 y num2, donde el primero siempre 
	 * deberá ser menor o igual al segundo. La computadora debe 
	 * mostrar la secuencia de números existentes entre ambos:
		a. Incluyéndolos;
		b. Excluyéndolos.
	 */
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		System.out.println("Ingrese un numero entero: ");
		num1 = input.nextInt();
		do {
			System.out.println("Ingrese otro numero entero (tiene que ser mayor o igual al segundo): ");
			num2 = input.nextInt();
		} while(!(num1 <= num2));

		System.out.println("Incluyendolos: ");
		for(int i = num1; i <=num2; i++) {
			System.out.println(i);
		}

		System.out.println("Excluyendolos: ");
		if (num1 == num2) {
			System.out.println("Conjunto vacío!");
		} else {
			for(int i = num1 + 1; i < num2; i++) {
				System.out.println(i);
			}
		}
	}

}
