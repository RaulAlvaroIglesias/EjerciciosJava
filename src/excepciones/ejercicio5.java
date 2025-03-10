/*Escribe un programa que pida al usuario que introduzca un número decimal. 
 * Asegúrese de manejar la excepción que ocurre si el usuario introduce un valor no numérico o no decimal.
 */

package excepciones;

import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        String entrada = scanner.nextLine();

        try {
            double numeroDecimal = Double.parseDouble(entrada);
            System.out.println("El número decimal introducido es: " + numeroDecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Debes introducir un número decimal.");
        }

        scanner.close();
    }

}
