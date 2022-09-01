package actividad_3;

import java.util.Scanner;
/*
 * Realizá un programa que permita controlar con validación el ingreso a un sitio web. Teniendo
ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), 
el programa debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la
cuenta".
 */
public class Ejercicio_38 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final String USUARIO_CORRECTO = "admin", PASSWORD_CORRECTA = "123456", GOOD_ENDING = "Acceso concedido", BAD_ENDING = "Se ha bloqueado la cuenta";
		final int INTENTOS_MAXIMOS = 3;
		int intentosActuales = 0;
		String usuario = "", password = "";
		boolean accesoConcedido = false;
		do {
			System.out.println("Ingrese su usuario: ");
			usuario = input.nextLine();
			System.out.println("Ingrese su contreseña: ");
			password = input.nextLine();
			accesoConcedido = usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTA);
			intentosActuales += 1;
		} while(!accesoConcedido && intentosActuales < INTENTOS_MAXIMOS);

		if (accesoConcedido) {
			System.out.println(GOOD_ENDING);
		} else {
			System.out.println(BAD_ENDING);
		}
	}

}
