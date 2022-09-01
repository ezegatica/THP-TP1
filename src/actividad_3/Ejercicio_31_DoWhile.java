package actividad_3;

import java.util.Scanner;

/*
 * Realizá un programa que permita validar una opción ingresada. Se le preguntará al usuario si
desea continuar con alguna operación de la forma ​ "¿Deseás continuar? [S/N]"​ . Se
espera que el usuario ingrese una ​ 'S' ​ o una ​ 'N' ​ (incluir las minúsculas). La opción debe ser
ingresada tanto como sea necesario hasta que quede comprendida dentro de las
posibilidades esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo ​ while ​ y
con ciclo ​ do​ - ​ while​ .
 */
public class Ejercicio_31_DoWhile {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char operacion = '_';
		
		do {
			System.out.println("¿Deseás continuar? [S/N]");
			operacion = input.nextLine().toUpperCase().charAt(0);
		} while (operacion != 'N' && operacion != 'S');

		System.out.println("Salida");
	}

}
