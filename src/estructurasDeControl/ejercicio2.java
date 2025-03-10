/*Escribe un programa que solicite 
 * al usuario un número entre 1 y 7,
 *  y muestre el día de la semana correspondiente.
 */

package estructurasDeControl;

import java.util.Scanner;

public class ejercicio2 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Introduce un número del 1 al 7: ");
	        int dia = scanner.nextInt();
	        
	        
	        switch (dia) {
	            case 1:
	                System.out.println("El día de la semana es Lunes.");
	                break;
	            case 2:
	                System.out.println("El día de la semana es Martes.");
	                break;
	            case 3:
	                System.out.println("El día de la semana es Miércoles.");
	                break;
	            case 4:
	                System.out.println("El día de la semana es Jueves.");
	                break;
	            case 5:
	                System.out.println("El día de la semana es Viernes.");
	                break;
	            case 6:
	                System.out.println("El día de la semana es Sábado.");
	                break;
	            case 7:
	                System.out.println("El día de la semana es Domingo.");
	                break;
	            default:
	                System.out.println("Número inválido. Debe estar entre 1 y 7.");
	        }
	        
	        scanner.close();
	    }
}
