package actividad_2;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el                              
mayor. [EC]
 */
public class Ejercicio_12 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1=0, num2=0;
		System.out.println("Ingrese un numero entero: ");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero entero: ");
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println("El numero 1 es mayor que el numero 2");
		} else if (num1 < num2){
			System.out.println("El numero 1 es menor que el numero 2");
		} else {
			System.out.println("Los numeros son iguales!");
		}
	}

}
