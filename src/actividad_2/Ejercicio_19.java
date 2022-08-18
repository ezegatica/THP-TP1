package actividad_2;
import java.util.Scanner;

/*
 * . Existen dos reglas que identifican dos conjuntos de valores:
a. El número es de un solo dígito.
b. El número es impar.

A partir de estas reglas, realizá un programa que permita ingresar un número entero. 

Debe asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, 

según corresponda, para indicar si el valor número ingresado pertenece o no a cada conjunto. 
Definí un lote de prueba de varios números y probá el algoritmo, escribiendo los resultados 
tal como se hizo en los ejercicios anteriores

NUM		UN_DIGITO	ES_IMPAR	EN_AMBOS	EN_NINGUNO
1		V			V			V			F
20		F			F			F			V
6		V			F			F			F
55		F			V			F			F		
 */
public class Ejercicio_19 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Ingresar un numero entero: ");
		num = input.nextInt();
		
		boolean esDeUnSoloDigito = num >= 0 && num < 10;
		boolean esImpar = (num % 2) == 1;
		boolean estaEnAmbos = (esDeUnSoloDigito && esImpar);
		boolean noEstaEnNinguno = !(esDeUnSoloDigito || esImpar);
		
		if (esDeUnSoloDigito) {
			System.out.println("El numero tiene un solo dígito!");
		}
		if (esImpar) {
			System.out.println("El numero es impar!");
		}
		if (estaEnAmbos) {
			System.out.println("El numero esta en ambos!");
		} else if (noEstaEnNinguno) { 
			// Como un número no puede estar en ambos Y en ninguno, por lo que se agrega al else
			System.out.println("El numero no esta en ninguno");
		}
	}
}
