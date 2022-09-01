package actividad_3;

import java.util.Scanner;
/*
 * Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada
jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la
estatura promedio del equipo.
 */
public class Ejercicio_34 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final double CARACTER_ESCAPE = 0.0;
		double estaturaJugador = -1.0, promedioEstaturas, sumaEstaturas = 0.0;
		int cantidadJugadores = 0;
		do {
			do {
				System.out.println(
						"Por favor, ingrese una estatura(en metros decimales) de un jugador del equipo de baloncesto:");
				estaturaJugador = Double.parseDouble(input.nextLine());
			} while (estaturaJugador != CARACTER_ESCAPE && estaturaJugador < 0);
			if (estaturaJugador != CARACTER_ESCAPE) {
				sumaEstaturas += estaturaJugador;
				cantidadJugadores += 1;
			}
		} while (estaturaJugador != CARACTER_ESCAPE);

		promedioEstaturas = sumaEstaturas / cantidadJugadores;
		System.out.println("La carga promedio del equipo es: " + promedioEstaturas);
	}

}
