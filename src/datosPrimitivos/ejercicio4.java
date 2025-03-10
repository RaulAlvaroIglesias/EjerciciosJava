/*Escribe un programa que calcule el área de un 
 círculo, dado su radio.*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce radio del circulo: ");
		double radio= scanner.nextDouble();
		
		double area= Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: "+area);
		
		scanner.close();
	}
}
