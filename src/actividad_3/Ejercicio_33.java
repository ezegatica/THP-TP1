package actividad_3;
/*
 * . Realizá un programa que permita al usuario ingresar números hasta que se introduzca un ​ 0 ​ .
La computadora debe mostrar el número máximo y el número mínimo. [EC]
 */
import java.util.Scanner;

public class Ejercicio_33 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero, maximo = Integer.MIN_VALUE, minimo= Integer.MAX_VALUE;
		final int CARACTER_ESCAPE = 0;
		do {
			System.out.println("Por favor, ingrese un numero:");
			numero = Integer.parseInt(input.nextLine());
			if (numero != CARACTER_ESCAPE) {
				if (numero > maximo) {
					maximo = numero;
				}
				if (numero < minimo) {
					minimo = numero;
				}
			}
		} while (numero != CARACTER_ESCAPE);

		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
	}

}
