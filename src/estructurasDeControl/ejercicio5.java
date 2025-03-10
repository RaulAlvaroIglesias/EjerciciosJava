/*Escribe un programa que solicite una contraseña al usuario. 
 * Debe permitir hasta 3 intentos. Si la contraseña es correcta
 */

package estructurasDeControl;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "123abc"; // 
        String contrasenaIngresada;
        int intentos = 3;
        boolean accesoConcedido = false;

        
        do {
            System.out.print("Introduce la contraseña: ");
            contrasenaIngresada = scanner.nextLine();

            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                accesoConcedido = true; 
                System.out.println("Acceso concedido.");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta, te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Acceso denegado. No te quedan más intentos.");
                }
            }
        } while (!accesoConcedido && intentos > 0);

        scanner.close();
    }
	
}
