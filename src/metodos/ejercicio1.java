/*Escribe un programa que tenga un método llamado sumarque reciba dos números enteros como parámetros 
 * y devuelva su suma. Luego, en el método main, solicita al usuario dos números y muestra el resultado 
 * de la suma utilizando el método.*/

package metodos;

import java.util.Scanner;

public class ejercicio1 {
	
    public static int sumar(int a, int b) {
        return a + b;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        
        int resultado = sumar(num1, num2);
        
       
        System.out.println("La suma es: " + resultado);
        
        scanner.close();
    }
	

}
