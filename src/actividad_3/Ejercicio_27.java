package actividad_3;
import java.util.Scanner;

public class Ejercicio_27 {
	private static Scanner input = new Scanner(System.in);
	/*
Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
las edades ingresadas y cuántas edades fueron valores impares mayores que 18. [EC]
*/

	public static void main(String[] args) {
		final int CANTIDAD_EDADES = 5;
		final int EDAD_DE_MAYORIA = 18;

		int totalEdades = 0;
		int edadesImparesYDeMayoria = 0;
		int edadIngresada = 0;

		for (int i=0; i<CANTIDAD_EDADES; i++) {
			System.out.println("Ingrese una edad: ");
			edadIngresada = Integer.parseInt(input.nextLine());
			if (edadIngresada >= EDAD_DE_MAYORIA && edadIngresada%2 == 1) {
				edadesImparesYDeMayoria += 1;
			}
			totalEdades += edadIngresada;
		}

		System.out.println("El promedio de edad es " + (totalEdades / CANTIDAD_EDADES));
		System.out.println("La cantidad de personas con edad impar y mayor de edad es: " + edadesImparesYDeMayoria);
	}

}
