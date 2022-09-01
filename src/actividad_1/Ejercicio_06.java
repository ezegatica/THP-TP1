package actividad_1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar el monto total de las ventas realizadas por un 
vendedor durante el mes, 

de quien se sabe que gana un sueldo fijo de 44000 pesos 

más el 16 por ciento del monto total vendido. 
Con tales datos debes calcular y mostrar el importe a cobrar por el vendedor.

 */
public class Ejercicio_06 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int SUELDO_FIJO = 44000, PORCENTAJE_VENDEDOR = 16;
		double sueldoACobrar = 0, parteDelVendedor = 0, montoTotalDelMes = 0;
		System.out.println("Ingrese el monto total de las ventas realizadas durante el mes: ");
		montoTotalDelMes = input.nextDouble();
		
		parteDelVendedor = (montoTotalDelMes * PORCENTAJE_VENDEDOR ) / 100;
		
		sueldoACobrar = SUELDO_FIJO + parteDelVendedor;
		
		System.out.print("El importe a cobrar por el vendedor es de " + sueldoACobrar);
	}

}
