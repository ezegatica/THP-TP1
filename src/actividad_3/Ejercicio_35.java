package actividad_3;
import java.util.Scanner;

public class Ejercicio_35 {
	private static Scanner input = new Scanner(System.in);
	/*
Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para
cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un
asterisco ('*'). Mostrar al final cómo se llama la persona más joven
	 */

	public static void main(String[] args) {
		String nombre = "";
		int edad = 0;
		String personaMasJoven = "";
		int edadMinima = Integer.MAX_VALUE;

		final String CARACTER_SALIDA = "*";


		do {
			System.out.println("Ingrese un nombre: ");
			nombre = input.nextLine();
			if (!nombre.equals(CARACTER_SALIDA)) {
				System.out.println("Ingrese la edad de " + nombre + ":");
				edad = Integer.parseInt(input.nextLine());

				if (edad < edadMinima) {
					personaMasJoven = nombre;
					edadMinima = edad;
				}	
			} else {				
				System.out.println("SALIDA ACTIVADA");
			}
		} while(!nombre.equals(CARACTER_SALIDA));

		if (personaMasJoven.equals("")) {
			System.out.println("No se ingresó ninguna persona");
		} else {
			System.out.println("La persona mas joven ser llama " + personaMasJoven + " y tiene " + edadMinima + " años.");			
		}
	}

}
