package actividad_1;

import java.util.Scanner;

/*
 * 3. Realizá un programa que permita ingresar un número entero. Debe mostrarse el número                        
ingresado:
a. Multiplicado por 5.
b. Dividido por 2.
 */
public class Ejercicio_03 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int MULTIPLICACION = 5;
		final int DIVISION = 2;

		System.out.print("Ingrese un numero entero: ");
		int numero = input.nextInt();
		int resultadoA = numero * MULTIPLICACION;
		double resultadoB = numero / DIVISION;

		System.out.println("El resultado a es: " + resultadoA);
		System.out.println("El resultado b es: " + resultadoB);
	}
}
