package actividad_1;
import java.util.Scanner;
/*
 * Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el                                  
valor del metro cuadrado de tierra. 
Debe mostrarse el valor total del terreno y la cantidad de                                
metros de alambre para cercarlo completamente a tres alturas distintas. (PREGUNTAR)
 */
public class Ejercicio_7 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int ancho, largo, valorMetroCuadrado, areaTotal, valorTotalDeAlambre, valorTotalDelTerreno, altura;
		System.out.println("Ingrese el ancho del terreno (en mts): ");
		ancho = input.nextInt();
		System.out.println("Ingrese el largo del terreno (en mts): ");
		largo = input.nextInt();
		System.out.println("Ingrese el valor del metro cuadrado de tierra: $");
		valorMetroCuadrado = input.nextInt();
		
		areaTotal = ancho * largo;
		
		valorTotalDelTerreno = areaTotal * valorMetroCuadrado;
		
		System.out.println("Ingrese la altura del alambre: ");
		altura = input.nextInt();
		
		valorTotalDeAlambre = (2 * ancho * altura) + (2 * largo * altura);
		
		System.out.println("El valor total del terreno es de: $" + valorTotalDelTerreno);
		System.out.println("Se necesitan " + valorTotalDeAlambre + "mts2 de alambre.");
	}

}
