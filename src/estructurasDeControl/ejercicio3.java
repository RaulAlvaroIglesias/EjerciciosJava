/*Escribe un programa que solicita al usuario un número 
 * y luego imprime la tabla de multiplicar de ese número 
 * del 1 al 10.
 */

package estructurasDeControl;

import java.util.Scanner;

public class ejercicio3 {

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Introduce un número: ");
	        int numero = scanner.nextInt();
	        
	        
	        System.out.println("Tabla de multiplicar del " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	        
	        scanner.close();
	    }
}
