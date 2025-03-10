//Escribe un programa que copie el archivo lectura_nio.txt a un nuevo archivo llamado copia_lectura_nio.txt usando las clases de NIO.

package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copiarArchivoNIO {
	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\lectura_nio.txt";
		String rutaCopia= "C:\\Users\\Raúl\\Desktop\\copia_lectura_nio.txt" ;
		
		try {
			
			Path origen = Paths.get(ruta);
			Path destino = Paths.get(rutaCopia);
			
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado exitosamente.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}

}
