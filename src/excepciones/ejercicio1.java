/*Escribe un programa que pida al usuario dos números y los divididos. 
 * Asegúrese de manejar la excepción que ocurre cuando el divisor es cero.
 */

package excepciones;

import java.util.Scanner;

public class ejercicio1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el numerador: ");
	        int numerador = scanner.nextInt();
	        
	        System.out.print("Introduce el divisor: ");
	        int divisor = scanner.nextInt();
	        
	        try {
	            int resultado = numerador / divisor;
	            System.out.println("El resultado es: " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: No se puede dividir por cero.");
	        }
	        
	        scanner.close();
	    }
	
	
	
}
