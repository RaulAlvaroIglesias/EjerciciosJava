/*Escribe un programa que calcule la suma de todos
 *  los números pares del 1 al 100.
 */

package estructurasDeControl;

public class ejercicio4 {
	
	public static void main(String[] args) {
        int suma = 0;
        int numero = 1;

        
        while (numero <= 100) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            numero++;
        }
      
        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
        
    }

}
