package actividad_1;
import java.util.Scanner;

/*
 Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. 
Una vez cargadas, mostrar ambas variables por pantalla

, intercambiá sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas. [EC]
 */

public class Ejercicio_5 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, tmp;
		System.out.println("Ingresar numero 1: ");
		num1 = input.nextInt();
		System.out.println("Ingresar numero 2: ");
		num2 = input.nextInt();
		System.out.println("num1: " + num1 + ", num2: " + num2);
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("num1: " + num1 + ", num2: " + num2);

	}

}
