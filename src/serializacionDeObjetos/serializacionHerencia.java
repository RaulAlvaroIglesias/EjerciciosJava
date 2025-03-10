//Crea una clase Empleado que herede de Persona, con un atributo adicional salario. Serializa un objeto de la clase Empleado en un archivo empleado.ser y deserialízalo.

package serializacionDeObjetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializacionHerencia {
	
	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\empleado.ser";
		
		empleado e = new empleado("Raul", 27, 3680.25);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
			
			oos.writeObject(e);
			System.out.println("Empleado serializado.");
			
		}catch(IOException i) {
			i.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
			
			empleado emple = (empleado) ois.readObject();			
			
            System.out.println("Nombre: " + emple.nombre);
            System.out.println("Edad: " + emple.edad);
            System.out.println("Salario: " + emple.salario);
			
		}catch(IOException i) {
			i.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
				
	}

}

class empleado extends persona{
	
	double salario;
	
	public empleado(String nombre, int edad, double salario) {
		
		super(nombre,edad);
		this.salario=salario;
		
	}
	
}