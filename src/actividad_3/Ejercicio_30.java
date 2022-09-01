package actividad_3;

import java.util.Scanner;

/*
 * Realizá un programa que permita realizar varias operaciones matemáticas ingresando un              
caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’) y dos números enteros en el 
caso que no haya elegido ‘F’. La computadora debe mostrar el resultado para la operación                            
ingresada. Considerar que no se puede dividir por cero. Cuando la operación ingresada sea                        
‘F’ nos indicará que no se desean calcular más operaciones. [EC]
 */

public class Ejercicio_30 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char operacion = '{';
		int numero1, numero2;
		final char SUMA = '+', RESTA = '-', DIVISION = '/', MULTIPLICAR = '*', FINALIZAR = 'F';
		do {

			do {
				System.out.println("Por favor ingrese una operacion a realizar:");
				operacion = input.nextLine().toUpperCase().charAt(0);
			} while (operacion != SUMA && operacion != RESTA && operacion != DIVISION && operacion != MULTIPLICAR && operacion != FINALIZAR);

			if (operacion != FINALIZAR) {
				System.out.println("Ingrese el primer numero:");
				numero1 = Integer.parseInt(input.nextLine());
				System.out.println("Ingrese el segundo numero:");
				numero2 = Integer.parseInt(input.nextLine());

				switch (operacion) {
				case SUMA:
					System.out.println("La suma es: " + (numero1 + numero2));
					break;
				case RESTA:
					System.out.println("La resta es: " + (numero1 - numero2));
					break;
				case MULTIPLICAR:
					System.out.println("La multiplicacion es: " + (numero1 * numero2));
					break;
				case DIVISION:
					if (numero2 != 0) {
						System.out.println("La division es: " + (numero1 / numero2));
					} else {
						System.out.println("No se puede dividir por cero");
					}
					break;
				}
			} else {
				System.out.println("Ingresaste F para finalizar");
			}
		} while (operacion != FINALIZAR);
	}

}
