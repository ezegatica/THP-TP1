package actividad_2;
import java.util.Scanner;

/*
 *  Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la                            
cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, 

Si los asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse
 */

public class Ejercicio_16 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidadInscriptos = 0, cantidadAsientos = 0, asientosFaltantes = 0;
		System.out.println("Ingresar la cantidad de inscriptos: ");
		cantidadInscriptos = input.nextInt();
		System.out.println("Ingresar la cantidad de asientos: ");
		cantidadAsientos = input.nextInt();
		if (cantidadInscriptos > cantidadAsientos) {
			asientosFaltantes = cantidadInscriptos - cantidadAsientos;
			System.out.println("No alcanzan! " + '\n' + "Faltan " + asientosFaltantes + " asientos.");
		} else {
			System.out.println("Alcanzan!");
		}

	}

}
