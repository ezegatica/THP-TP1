package actividad_2;
import java.util.Scanner;

/*
 * . Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y                                
su valor. [EC]
 */
public class Ejercicio_13 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0;
		System.out.println("Ingrese un numero entero: ");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero entero: ");
		num2 = input.nextInt();
		System.out.println("Ingrese un ultimo numero entero: ");
		num3 = input.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero 1 (" + num1 +") es el mayor");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("El numero 2 (" + num2 +") es el mayor");
		} else {
			System.out.println("El numero 3 (" + num3 +") es el mayor");
		}
	}

}
