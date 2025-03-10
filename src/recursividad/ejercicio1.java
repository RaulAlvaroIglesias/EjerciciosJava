//Implementa una función recursiva para calcular el factorial de un número.

package recursividad;

public class ejercicio1 {
	 public static int factorial(int n) {
	        if (n == 0) {
	            return 1; 
	        }
	        return n * factorial(n - 1); 
	    }

	    public static void main(String[] args) {
	        int numero = 5;
	        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
	    }
}
