/*Escribe un programa que tenga un método llamado calcularFactorial que reciba un número entero como parámetro
 *  y devuelva su factorial. Luego, en el método main, solicita un número al usuario y muestra su factorial 
 *  utilizando el método.
*/

package metodos;

import java.util.Scanner;

public class ejercicio3 {
	
    public static int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        int resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
        
        scanner.close();
    }

}
