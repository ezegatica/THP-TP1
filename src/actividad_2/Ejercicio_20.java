package actividad_2;
import java.util.Scanner;

/*
 *  Realizá un programa que permita ingresar dos números enteros y la operación a realizar 
 * ('+','-', '*', '/'). 
 * Debe mostrarse el resultado para la operación ingresada. Considerar
 * que no se puede dividir por cero (en ese caso mostrar el texto 'ERROR'). [EC]
 */

public class Ejercicio_20 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		final char SUMA = '+';
		final char RESTA = '-';
		final char MULTIPLICACION = '*';
		final char DIVISION = '/';
		final String MENSAJE_ERROR = "ERROR";
		char operacion = ';';

		System.out.println("Ingrese un numero entero: ");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero entero: ");
		num2 = input.nextInt();
		System.out.println("Selecciona la operacion a realizar ('+','-', '*', '/'): ");
		operacion = input.next().charAt(0);

		switch(operacion) {
		case SUMA:
			System.out.println("La suma da: " + (num1 + num2));
			break;
		case RESTA:
			System.out.println("La resta da: " + (num1 - num2));
			break;
		case MULTIPLICACION:
			System.out.println("La multiplicacion da: " + (num1 * num2));
			break;
		case DIVISION:
			if (num2 == 0) {
				System.out.println(MENSAJE_ERROR);
			} else {			
				System.out.println("La divison da: " + (num1 / num2));
			}
			break;
		default:
			System.out.println("Tipo de operacion incorrecta!");
			break;
		}

	}

}
