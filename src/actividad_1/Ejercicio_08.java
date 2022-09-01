package actividad_1;
import java.util.Scanner;

/*
 *  Realizá un programa que permita ingresar dos números naturales. 
 *  Debes mostrar los                      
resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC]
 */
public class Ejercicio_08 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double division, num1, num2, suma, resta, multiplicacion = 0;
		System.out.println("Ingrese el primer numero (entero): ");
		num1 = input.nextDouble();
		System.out.println("Ingrese el segundo numero (entero): ");
		num2 = input.nextDouble();
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		System.out.println("El resultado de la suma es: " 
				+ suma + "\nEl resultado de la resta es: " 
				+ resta + "\nEl resultado de la multiplicación es: "
				+ multiplicacion + "\nEl resultado de la división es: "
				+ division);
		
		

	}

}
