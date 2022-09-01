package actividad_3;

import java.util.Scanner;

public class Ejercicio_36 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int PROMEDIO_MAXIMO = 20;
		int numeroIngresado = 0, cantidadNumerosIngresados = 0, totalIngresado = 0;
		double promedioActual = 0;
		do {
			System.out.println("Ingrese numeros: ");
			numeroIngresado = Integer.parseInt(input.nextLine());
			
			cantidadNumerosIngresados += 1;
			totalIngresado += numeroIngresado;
			promedioActual = totalIngresado / cantidadNumerosIngresados;
			if (promedioActual >= PROMEDIO_MAXIMO) {
				System.out.println("PROMEDIO MAXIMO SUPERADO, EL PROGRAMA TERMINARÁ");
			}
		} while (promedioActual < PROMEDIO_MAXIMO);
	}

}
