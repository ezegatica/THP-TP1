package actividad_3;
import java.util.Scanner;

public class Ejercicio_39 {
	private static Scanner input = new Scanner(System.in);
	/*
	 * Nos proponemos desarrollar un "tiro al blanco" en el cual 2 o mas participantes realizan 3 disparos consecutivos cada uno.
	 * 
	 * Cada tiro, dependiendo de la distancia al centro da un puntaje que se acumula (se suman los tres disparos). Gana el jugador con mayor
	 * puntaje (se supone unico)
	 * 
	 * La puntiacion para cada tiro es la siguiente:
	 * 	- Si la distancia respecto al centro es 0, se ganan 500 puntos;
	 *  - Si la distancia es <= 10, se ganan 250
	 *  - Si la distancia esta entre 11 y 50, se ganan 100 puntos
	 *  - Si es mayor, no ganara nada (cayo fuera del tablero)
	 *  
	 * La mecanica del juego es la siguiente:
	 * - Se pide la cantidad de jugadores (mayor o igual a 2)
	 * 
	 * Por cada jugador:
	 * 	- Ingresar el nombre
	 *  - Ingresar la distancia de cada uno de sus tres tiros consecutivos (numero mayor o igual a 0) calcuilando para cada uno de estos el puntaje
	 *  obtenido
	 *  
	 *  Se pide:
	 *  - Informar el nombre del participante ganador del torneo y su puntaje (suponer unico maximo)
	 *  - Informar la cantidad total de tiros al centro
	 */
	public static void main(String[] args) {
		final int MINIMO_PARTICIPANTES = 2;
		final int DISPAROS_CONSECUTIVOS = 3;
		int mayorPuntaje = Integer.MIN_VALUE, cantidadTirosAlCentro = 0, cantidadJugadores = 0;
		String mayorNombre = "";

		// Ingreso cantidad de jugadores
		do {
			System.out.println("Ingresá una cantidad de jugadores (Minimo 2)");
			cantidadJugadores = Integer.parseInt(input.nextLine());
		} while(cantidadJugadores < MINIMO_PARTICIPANTES);

		// Ciclo de cada jugador, "cantidadJugadores" veces
		for (int i = 1; i <= cantidadJugadores; i++) {
			int puntaje = 0;
			String nombre;
			do {
				System.out.println("Ingrese el nombre del jugador " + i);
				nombre = input.nextLine();				
			} while(nombre.equals(""));
			

			// Ciclo disparos de jugador "i"
			for (int j = 1; j <= DISPAROS_CONSECUTIVOS; j++) {
				int distancia = -1; // Se inicializa en un valor incorrecto para forzar la entrada de distancia
				do {
					System.out.println("Ingrese la distancia al centro del tablero (minimo: 0) del tiro " + j + " de " + nombre); 
					distancia = Integer.parseInt(input.nextLine());
				} while (distancia < 0);

				// Calculo de puntaje para tiro "j"
				if (distancia == 0) {
					puntaje += 500;
					cantidadTirosAlCentro += 1;
				} else if (distancia > 0 && distancia <= 10) {
					puntaje += 250;
				} else if (distancia > 10 && distancia <= 50) {
					puntaje += 100;
				}
			}

			// Despues de los disparos, se calcula si es el puntaje mayor
			if (puntaje > mayorPuntaje) {
				mayorPuntaje = puntaje;
				mayorNombre = nombre;
			}
			puntaje = 0;
		}
		// Anunciar ganador y cantidad de tiros al centro
		System.out.println("El ganador del torneo es " + mayorNombre + ", que hizo " + mayorPuntaje + " puntos.");
		System.out.println("Hubieron " + cantidadTirosAlCentro + " tiros al blanco!");
	}
}
