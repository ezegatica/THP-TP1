package actividad_2;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar una edad (entre                  
 * 1 y 120 años) y un género ('F'para mujeres, 'M' para hombres). 
 *
 * En caso de haber ingresado valores erróneos (edad fuera de rango o género inválido), 
 * informar tal situación. 
 * 
 * Si los datos están bien ingresados el programa debe indicar, 
 * sabiendo que las mujeres se jubilan con 60 años o más y los hombres con 65 años o más, 
 * si la persona está en edad de jubilarse.

 */
public class Ejercicio_17 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		String genero;
		
		System.out.println("Ingrese la edad de la persona: ");
		edad = input.nextInt();
		
		System.out.println("Ingrese el genero de la persona ('F' para Femenino, 'M' para masculino");
		genero = input.next();

		boolean generoIncorrecto = !(genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F"));
		boolean edadIncorrecta = (edad < 1 || edad > 120);

		if (generoIncorrecto|| edadIncorrecta) {
			System.out.println("Se ingresó informacion erronea");
		} else {
			boolean mujerSePuedeJubilar = (genero.equalsIgnoreCase("F") && edad >= 60);
			boolean hombreSePuedeJubilar = (genero.equalsIgnoreCase("M") && edad >= 65);

			if (mujerSePuedeJubilar || hombreSePuedeJubilar) {
				System.out.println("Se puede jubilar!");
			} else {
				System.out.println("No se puede jubilar!");
			}
		}
	}

}
