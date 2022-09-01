package actividad_3;
/*
 * Realizá un programa que permita validar la nota de un examen de la misma manera que el
ejercicio 29​ pero con las siguientes nuevas directivas:
● Las notas 1 y 3 no usan nunca.
● La nota 0 se reserva para los ausentes
En resumen, las notas válidas pueden ser un ​ 2 ​ ​ o un valor entre ​ 4 ​ ​ y ​ 10​ . [EC]
 */
import java.util.Scanner;

public class Ejercicio_32 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota = -1;
		do {
			System.out.println("Ingrese una nota válidas: puede ser un 2 o un valor entre ​ 4 ​y 10:");
			nota = Integer.parseInt(input.nextLine());
			if (nota == 0) {
				System.out.println("Ausente");
			}else if(nota == 1 || nota == 3) {
				System.out.println("La nota 1 y 3 no se usan nunca");
			}
			
		} while (!(nota == 2 || (nota >= 4 && nota<=10)));

		System.out.println("La nota es: " + nota);

	}

}
