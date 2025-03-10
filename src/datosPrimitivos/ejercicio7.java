/*Escribe un programa que convierta una cantidad de
 minutos introducida por el usuario a su 
 equivalente en horas y minutos. */

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio7 {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Introduce una cantidad de minutos: ");
	        int minutosTotales = scanner.nextInt();

	        
	        int horas = minutosTotales / 60;  
	        int minutosRestantes = minutosTotales % 60;  

	        
	        System.out.println(minutosTotales + " minutos es igual a " + horas + " horas y " + minutosRestantes + " minutos.");

	        
	        scanner.close();
	    }
}
