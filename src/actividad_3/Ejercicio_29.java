package actividad_3;
import java.util.Scanner;

public class Ejercicio_29 {
	public static final Scanner input=new Scanner(System.in);

	/*
	 * Realizá un programa que permita validar la nota de un examen. 
	 * Se espera que la nota que el usuario ingrese sea un número 
	 * comprendido entre 0 y 10. La misma debe ser ingresada tantas 
	 * veces como sea necesario hasta que quede comprendida dentro del 
	 * rango indicado. [EC]
	 */
	public static void main(String[] args) {
		int nota = -1; // Se pone un numero que esté fuera de los valores correctos, para que si se toca enter de una, te pide reingresarlo.
		do {
			System.out.println("Ingrese la nota del usuario (deben ser valores entre 0 y 10)");
			nota = input.nextInt();			
		} while(nota < 0 || nota > 10);

		System.out.println("La nota " + nota + " es valida.");
	}
}
