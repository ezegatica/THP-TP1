package actividad_1;
import java.util.Scanner;

/*
 * 4. Realizá un programa que permita ingresar el valor monetario de una hora de 
 * trabajo y la cantidad de horas trabajadas por día por un trabajador. 

Debes mostrar el valor del salario semanal, sabiendo que trabaja todos los días 
hábiles y la mitad de las horas del día hábil los                                  
sábados. (Todas las horas valen lo mismo.)

 */

public class Ejercicio_4 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double precioHora = 0;
		double salarioSemanal = 0;
		int cantidadHoras = 0;

		System.out.println("Ingrese el valor monetario de una hora de trabajo: $");
		precioHora = input.nextDouble();
		System.out.println("Ingrese la cantidad de horas trabajadas por dia: ");
		cantidadHoras = input.nextInt();
				
		salarioSemanal = (5.5 * cantidadHoras) * precioHora;
		
		System.out.println("El salario semanal de la persona es: $" + salarioSemanal);

	}

}
