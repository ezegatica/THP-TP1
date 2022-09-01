package actividad_2;
import java.util.Scanner;

/*
. Para entrar a la montaña rusa           
Miedo a las alturas, algo más chica y tranquila que la anterior,                
alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años
o medir más de 1,50 metros. Realizá el mismo procedimiento que con el ejercicio anterior                  
pero con los nuevos requisitos. [EC] 


NOMBRE 	EDAD	ALTURA	ENTRA?
JUAN	5		1.45	N
MARIA	7		1.23	Y
LUIS	8		1.51	Y
ANA		9		1.39	Y
 */

public class Ejercicio_15 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre = "";
		int edad = 0;
		double altura = 0.0;
		final int EDAD_MINIMA = 6;
		final double ALTURA_MINIMA = 1.50;
		System.out.println("Ingresar el nombre: ");
		nombre = input.nextLine();
		System.out.println("Ingresar la edad: ");
		edad = input.nextInt();
		System.out.println("Ingresar la altura: ");
		altura = input.nextDouble();
		if (edad >= EDAD_MINIMA || altura > ALTURA_MINIMA) {
			System.out.println(nombre + " pasa.");
		} else {
			System.out.println(nombre + " no pasa.");
		}
	}

}
