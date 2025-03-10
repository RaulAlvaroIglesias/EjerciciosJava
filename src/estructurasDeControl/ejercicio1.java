/*Escribe un programa que solicite al usuario que 
 * ingrese un número y determine si es 
 * positivo, negativo o igual a cero.
 */

package estructurasDeControl;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Introduce un número: ");
	        int numero = scanner.nextInt();
	        
	        
	        if (numero > 0) {
	            System.out.println("El número es positivo.");
	        } else if (numero < 0) {
	            System.out.println("El número es negativo.");
	        } else {
	            System.out.println("El número es cero.");
	        }
	        
	        
	        scanner.close();
	    }
		
		
	}
	

