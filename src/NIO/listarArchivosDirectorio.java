// Implementa un programa que liste todos los archivos de un directorio mi_directorio/ usando DirectoryStream de NIO.

package NIO;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class listarArchivosDirectorio {
		public static void main(String[] args) {
			
			String ruta= "C:\\Users\\Raúl\\Desktop\\directorio";
			Path directorio = Paths.get(ruta);
			
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)){
				
				for(Path archivo : stream) {
					
					 System.out.println(archivo.getFileName());
					
				}
		
			}catch(Exception e) {
				e.printStackTrace();
			}			
			
		}

}
