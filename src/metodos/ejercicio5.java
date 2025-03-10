/*Escribe un programa que tenga un método llamado imprimirCadenaque reciba una cadena y 
 * un número entero N como parámetros, y luego imprima esa cadena N veces. En el método main, 
 * solicita una cadena y un número al usuario, y luego llama al método para imprimirla N veces.
 */

package metodos;

import java.util.Scanner;

public class ejercicio5 {
	
    public static void imprimirCadena(String cadena, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(cadena);
        }
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Introduce un número de veces a imprimir: ");
        int veces = scanner.nextInt();
        
        imprimirCadena(cadena, veces);
        
        scanner.close();
    }

}
