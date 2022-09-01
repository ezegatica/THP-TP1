package actividad_3;
import java.util.Scanner;
/*
 * Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que
representan los sueldos mensuales que percibió un empleado durante un año calendario. 
Si durante la carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún
no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos. 
Al finalizar mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
 */
public class Ejercicio_37 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int VALORES_MAXIMOS = 12;
		int cantidadSueldos = 0;
		int sueldoTotal = 0;
		int sueldoMes = 0;
		do {
			System.out.println("Ingresa el sueldo del mes " + (cantidadSueldos + 1));
			sueldoMes = Integer.parseInt(input.nextLine());
			if (sueldoMes >= 0) {
				sueldoTotal += sueldoMes;
				cantidadSueldos += 1;
			}
		} while ((cantidadSueldos < VALORES_MAXIMOS) && (sueldoMes >= 0));
		if (cantidadSueldos == VALORES_MAXIMOS) {
			System.out.println("El sueldo anual total es de: $" + sueldoTotal);			
		} else {
			System.out.println("El sueldo anual parcial es de: $" + sueldoTotal);			
		}
	}

}
