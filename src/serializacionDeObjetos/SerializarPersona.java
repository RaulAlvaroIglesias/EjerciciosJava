/* Crea una clase Persona con los atributos nombre y edad. 
 * Implementa un programa que serialice un objeto de la clase Persona y 
 * lo guarde en un archivo llamado persona.ser.
 */


package serializacionDeObjetos;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarPersona {
	
	public static void main(String[] args) {
		
		   String ruta ="C:\\Users\\Raúl\\Desktop\\persona.ser";
		   
		   persona p = new persona("Juan", 25);
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
	            oos.writeObject(p);
	            System.out.println("Persona serializada.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
		
	}
}

class persona implements Serializable{
	
	String nombre;
	int edad;
	
	public persona(String nombre, int edad) {
		
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	
	
	
}