/*Escribe un programa que solicite dos números 
 enteros y muestre cuál es el mayor o si son 
 iguales.*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		double num1= scanner.nextDouble();
		
		System.out.println("Introduce el segundo numero:");
		double num2= scanner.nextDouble(); 
		
		if(num1>num2) {
			System.out.println("Numero mayor: "+num1);
		}else if(num1==num2) {
			System.out.println("Numeros iguales");
		}else {
			System.out.println("Numero mayor: "+num2);
		}
		
	}
}
