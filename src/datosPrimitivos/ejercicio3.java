/*Escribe un programa que solicite un número entero 
y determine si es par o impar.*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num=scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
	scanner.close();
		
	}
	
	
	
}
