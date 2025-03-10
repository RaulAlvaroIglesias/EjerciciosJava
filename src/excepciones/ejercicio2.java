/*Crea un programa que inicialice un arreglo de enteros y solicita al usuario un índice. 
 * Asegúrese de manejar la excepción que ocurre si el índice está fuera de los 
 * límites del arreglo.
 */

package excepciones;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un índice (0-4): ");
        int indice = scanner.nextInt();
        
        try {
            System.out.println("El número en el índice " + indice + " es: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de límites.");
        }
        
        scanner.close();
    }

}
