package actividad_2;
import java.util.Scanner;

/*
 * Para entrar a la montaña rusa            }
 * Infierno en las alturas se requiere tener al menos 7 años y medir
más de 1,50 metros. Completá el siguiente cuadro a mano según los requisitos y luego haz el
programa que permita, según las edades y estaturas ingresadas por el usuario, obtener los                          
mismos resultados según los siguientes datos:

NOMBRE 	EDAD	ALTURA	ENTRA?
JUAN	5		1.45	N
MARIA	7		1.23	N
LUIS	8		1.51	Y
ANA		9		1.39	N
 */

public class Ejercicio_14 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre = "";
		int edad = 0;
		double altura = 0.0;
		System.out.println("Ingresar el nombre: ");
		nombre = input.nextLine();
		System.out.println("Ingresar la edad: ");
		edad = input.nextInt();
		System.out.println("Ingresar la altura: ");
		altura = input.nextDouble();
		if (edad < 7 || altura < 1.50) {
			System.out.println(nombre + " no pasa.");
		} else {
			System.out.println(nombre + " pasa.");
		}
	}

}
