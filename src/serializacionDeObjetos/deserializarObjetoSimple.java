/* Lee el archivo persona.ser que contiene un objeto serializado de la 
 * clase Persona, y muestra su contenido en la consola.
 */

package serializacionDeObjetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializarObjetoSimple {
	
	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\persona.ser";
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
			
			persona p = (persona) ois.readObject();
            System.out.println("Nombre: " + p.nombre);
            System.out.println("Edad: " + p.edad);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {  
            e.printStackTrace();
        }
		
		
	}
	
	

}
