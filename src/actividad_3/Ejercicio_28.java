package actividad_3;
import java.util.Scanner;

public class Ejercicio_28 {
	public static final Scanner input=new Scanner(System.in);

	/*
	 * Realizá un programa que a partir de un número entero cant 
	 * ingresado por el usuario permita cargar por teclado               
	 * cant números enteros. 
	 * La computadora debe mostrar cuál fue el mayor número y 
	 * en qué posición apareció
	 */
	public static void main(String[] args) {
		int cant = 0, numeroMayor = Integer.MIN_VALUE, posicionMayor = 0;
		System.out.println("¿Cuantos numeros queres ingresar?");
		cant = input.nextInt();
		for (int pos = 1; pos <= cant; pos++) {
			int numero = 0;
			System.out.println("Ingrese su numero #"+pos);
			numero = input.nextInt();
			if (numero > numeroMayor) {
				numeroMayor = numero;
				posicionMayor = pos;
			}
		}
		System.out.println("El numero mayor fue " + numeroMayor + " y aparecio en la posicion #" + posicionMayor);	
	}

}
