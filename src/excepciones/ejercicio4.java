/*Cree un programa que intente leer un archivo de texto. 
 * Maneja la excepción que puede ocurrir si el archivo no existe.
 */

package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio4 {
	
	public static void main(String[] args) {
        File archivo = new File("archivo_inexistente.txt");
        
        try {
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }
    }

}
