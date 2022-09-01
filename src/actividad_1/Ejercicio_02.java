package actividad_1;

import java.util.Scanner;
/*
 *  Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos                        
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
 */
public class Ejercicio_02 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int NOTAS_TOTALES = 3;
		int nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;

		System.out.println("Ingrese la nota 1: ");
		nota1 = input.nextInt();

		System.out.println("Ingrese la nota 2: ");
		nota2 = input.nextInt();

		System.out.println("Ingrese la nota 3: ");
		nota3 = input.nextInt();

		promedio = (nota1 + nota2 + nota3)/NOTAS_TOTALES;
		System.out.println("El promedio de notas es: " + promedio);
	}

}
