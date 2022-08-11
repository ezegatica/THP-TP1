package actividad_1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar dos números
 * 
 *  que representan las medidas en                        
grados de dos ángulos interiores de cierto triángulo.
 A partir de los valores de estos dos                              
ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la                            
suma de los ángulos interiores de todo triángulo es de 180º.
 */
public class Ejercicio_9 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, angulo3;
		final int SUMA_ANGULOS_INTERIORES = 180;
		System.out.println("Ingrese el valor del primer ángulo: ");
		num1 = input.nextInt();
		System.out.println("Ingrese el valor del segundo ángulo: ");
		num2 = input.nextInt();
		angulo3 = SUMA_ANGULOS_INTERIORES - (num1 + num2);
		System.out.println("El tercer angulo vale " + angulo3 +"°");
	}

}
