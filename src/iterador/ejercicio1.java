/*Crea una lista de nombres y usa un Iterator para recorrer la lista, mostrando cada nombre en la consola. 
 * Luego, elimina un nombre específico mientras iteras.*/


package iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ejercicio1 {
	
	 public static void main(String[] args) {
	        List<String> nombres = new ArrayList<>();
	        nombres.add("Juan");
	        nombres.add("Ana");
	        nombres.add("Carlos");


	        Iterator<String> iterator = nombres.iterator();
	        while (iterator.hasNext()) {
	            String nombre = iterator.next();
	            System.out.println(nombre);
	            

	            if (nombre.equals("Ana")) {
	                iterator.remove(); 
	            }
	        }

	        System.out.println("Lista después de eliminar 'Ana': " + nombres);
	    }

}
