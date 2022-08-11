package actividad_1;
import java.util.Scanner;

/*
 * . Realizá un programa que permita resolver el siguiente problema: 
 * 
 * Tres personas aportan diferente capital a una sociedad y desean saber el valor total aportado 
 * y qué porcentaje aportó cada una (indicando nombre y porcentaje). 
 * Solicitar la carga por teclado del nombre de cada socio, su capital aportado 
 * y a partir de esto calcular e informar lo requerido previamente.
 */
public class Ejercicio_10 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String n1, n2, n3;
		double c1, c2, c3, ct, p1, p2, p3;
		
		System.out.println("Ingrese el nombre de la persona 1");
		n1 = input.next();
		System.out.println("Ingrese la cantidad de capital que aportó " + n1 + ":");
		c1 = input.nextDouble();
		
		System.out.println("Ingrese el nombre de la persona 2");
		n2 = input.next();
		System.out.println("Ingrese la cantidad de capital que aportó " + n2 + ":");
		c2 = input.nextDouble();
		
		System.out.println("Ingrese el nombre de la persona 3");
		n3 = input.next();
		System.out.println("Ingrese la cantidad de capital que aportó " + n3 + ":");
		c3 = input.nextDouble();
		
		ct = c1 + c2 + c3;
		
		p1 = (c1 * 100) / ct;
		p2 = (c2 * 100) / ct;
		p3 = (c3 * 100) / ct;
		
		System.out.println("El valor total aportado es de: $" + ct);
		
		System.out.println(n1 + " aportó $" + c1 + " (" + p1 + "%) del total");
		System.out.println(n2 + " aportó $" + c2 + " (" + p2 + "%) del total");
		System.out.println(n3 + " aportó $" + c3 + " (" + p3 + "%) del total");

	}

}
