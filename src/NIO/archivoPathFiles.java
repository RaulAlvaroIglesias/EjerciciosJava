//Escribe un programa que cree un archivo vacío llamado archivo_nuevo.txt usando las clases Path y Files de NIO.

package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class archivoPathFiles {
	public static void main(String[] args) {
		
		String ruta= "C:\\Users\\Raúl\\Desktop\\archivo_nuevo.txt";
		
		try {
			Path path = Paths.get(ruta);
			Files.createFile(path);
			System.out.println("Archivo creado exitosamente.");
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
