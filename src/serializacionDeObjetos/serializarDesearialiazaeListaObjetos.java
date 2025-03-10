//Crea una lista de objetos de la clase Persona y serialízala en un archivo personas.ser. Luego, deserializa el archivo y muestra la información de cada persona en la consola.

package serializacionDeObjetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class serializarDesearialiazaeListaObjetos {

	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\personas.ser";
		List<persona> personas=new ArrayList<>();
		
		personas.add(new persona("Raul",27));
		personas.add(new persona("Jorge",29));
		personas.add(new persona("paula",24));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
			
			oos.writeObject(personas);
			 System.out.println("Lista de personas serializada.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream(ruta))){
		
			List<persona> personasDeserializadas = (List<persona>) ois.readObject();
			
			for(persona p : personasDeserializadas ) {
				System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad);
			}
					
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {  
            e.printStackTrace();
        }
				
	}
	
}
