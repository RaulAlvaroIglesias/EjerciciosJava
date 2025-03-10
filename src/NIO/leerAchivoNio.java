//Crea un programa que lea el contenido del archivo lectura_nio.txt usando la clase Files y lo muestre en la consola.

package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class leerAchivoNio {
	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\lectura_nio.txt";
		
		try {
			
			Path path = Paths.get(ruta);
			List<String> lineas =Files.readAllLines(path);
			
			for(String linea : lineas) {
				
				System.out.println(linea);
				
			}
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
