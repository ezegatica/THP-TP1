package actividad_3;

public class Ejercicio_22 {
/*
 * Realizá un programa que muestre todos los números enteros del 
 * 1 al 5, y luego los mismos números pero en orden inverso. [EC]
 */
	public static void main(String[] args) {
		final int PRIMER_NUMERO = 1, SEGUNDO_NUMERO = 5;
		for(int i = PRIMER_NUMERO; i <= SEGUNDO_NUMERO; i++) {
			System.out.println(i);
		}
		System.out.println("----------"); // Divisor
		for(int i = SEGUNDO_NUMERO; i >= PRIMER_NUMERO; i--) {
			System.out.println(i);
		}
	}

}
