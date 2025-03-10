/*Simula el historial de navegación de un navegador web usando una pila (Deque). 
 * 
 * 
 * Implementa métodos para agregar una nueva página al historial y retroceder a la página anterior.

Requisitos:

Usa Deque para almacenar las páginas web.
Implementa un método para visitar una nueva página.
Implementa un método para retroceder a la página anterior.*/

package pilaDeNavegacion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class historial {
	 public static void main(String[] args) {
	        

		        Deque<String> historial = new ArrayDeque<>();
		        
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        String comando;
		        String paginaActual = null;

		        while (true) {
		            System.out.println("\nHistorial: " + historial);
		            System.out.println("Página actual: " + (paginaActual != null ? paginaActual : "No hay páginas visitadas."));
		            System.out.println("Comandos: '+' para visitar una nueva página, '-' para retroceder, 'exit' para salir.");
		            System.out.print("Ingresa un comando: ");
		            comando = scanner.nextLine();

		            if (comando.equals("+")) {
		             
		                System.out.print("Ingresa la URL de la nueva página: ");
		                String nuevaPagina = scanner.nextLine();
		                if (paginaActual != null) {
		                    historial.push(paginaActual);  
		                }
		                paginaActual = nuevaPagina;
		                System.out.println("Has visitado: " + paginaActual);
		            } else if (comando.equals("-")) {
		     
		                if (!historial.isEmpty()) {
		                    paginaActual = historial.pop();
		                    System.out.println("Has retrocedido a: " + paginaActual);
		                } else {
		                    System.out.println("No hay más páginas en el historial para retroceder.");
		                }
		            } else if (comando.equals("exit")) {
		            
		                System.out.println("Saliendo del navegador...");
		                break;
		            } else {
		                System.out.println("Comando no reconocido. Intenta de nuevo.");
		            }
		        }

		        scanner.close();
		    }

}
