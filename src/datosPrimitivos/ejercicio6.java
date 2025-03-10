/*Escribe un programa que solicite al usuario un 
carácter y determine si es una letra mayúscula, 
minúscula o un símbolo especial.*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio6 {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Introduce un carácter: ");
	        char caracter = scanner.next().charAt(0); 

	        
	        if (Character.isUpperCase(caracter)) {
	            System.out.println("El carácter '" + caracter + "' es una letra mayúscula.");
	        }
	        
	        else if (Character.isLowerCase(caracter)) {
	            System.out.println("El carácter '" + caracter + "' es una letra minúscula.");
	        }
	        
	        else {
	            System.out.println("El carácter '" + caracter + "' es un símbolo especial.");
	        }

	        
	        scanner.close();
	    }
}
