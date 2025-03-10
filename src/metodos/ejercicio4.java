/*Escribe un programa que tenga un método llamado mayorDeTresque reciba tres números enteros como parámetros 
 * y devuelva el mayor de ellos. Luego, en el método main, solicita tres números al usuario y muestra cuál 
 * es el mayor utilizando el método.*/

package metodos;

import java.util.Scanner;

public class ejercicio4 {
	
    public static int mayorDeTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mayor = mayorDeTres(num1, num2, num3);
        System.out.println("El número mayor es: " + mayor);
        
        scanner.close();
    }
    
    

}
