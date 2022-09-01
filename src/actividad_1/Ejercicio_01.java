package actividad_1;

import java.util.Scanner;

public class Ejercicio_01 {
	private static Scanner input = new Scanner(System.in);

/*
 * Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir                            
una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
 */
	public static void main(String[] args) {
		String nombre = "";
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre + "!");
	}

}
