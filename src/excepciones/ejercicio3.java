/*Escribe un programa que pida al usuario un número como cadena y lo convierta a un número entero. 
 * Maneja la excepción que puede ocurrir si el usuario ingresa un valor no numérico.
 */

package excepciones;

import java.util.Scanner;

public class ejercicio3 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce un número: ");
	        String entrada = scanner.nextLine();
	        
	        try {
	            int numero = Integer.parseInt(entrada);
	            System.out.println("El número es: " + numero);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Entrada no válida. Debes introducir un número.");
	        }
	        
	        scanner.close();
	    }
}
