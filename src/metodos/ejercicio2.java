/*Escribe un programa que tenga un método llamado esParque reciba un número entero como parámetro
 *  y devuelva truesi el número es par, o falsesi es impar. Luego, en el método main, 
 *  solicita un número al usuario y muestra si es par o impar.*/

package metodos;

import java.util.Scanner;

public class ejercicio2 {
	
	  public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce un número: ");
	        int numero = scanner.nextInt();
	        
	        if (esPar(numero)) {
	            System.out.println("El número es par.");
	        } else {
	            System.out.println("El número es impar.");
	        }
	        
	        scanner.close();
	    }
}
