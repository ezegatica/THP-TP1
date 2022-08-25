package actividad_2;
import java.util.Scanner;

/*
 * Realizá un programa que permita al usuario ingresar dos números enteros. 
 * 
 * La computadora                        
debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un      
número entero b cuando el resto de la división entre a y b es 0.
 */

public class Ejercicio_18 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, mayor = 0, menor = 0;

		System.out.println("Ingrese un numero entero positivo: ");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero entero positivo: ");
		num2 = input.nextInt();
		
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		if (menor == 0) {
			System.out.println("No se puede dividir por 0!");
		} else {			
			if (mayor % menor == 0) {
				System.out.println(mayor + " es divisible por " + menor);
			} else {
				System.out.println(mayor + " no es divisible por " + menor);
			}
		}
	}

}
