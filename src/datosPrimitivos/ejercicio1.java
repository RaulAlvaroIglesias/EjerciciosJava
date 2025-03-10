/*Conversión de Temperaturas en Java, 
donde se convierte una temperatura dada 
en grados Celsius a Fahrenheit*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		
		Scanner scanner= new  Scanner(System.in);
		
		System.out.print("Introduce la temperatura en grado Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit =(celsius*9/5)+32;
		
		System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");
		
		scanner.close();
		
		
	}
}
