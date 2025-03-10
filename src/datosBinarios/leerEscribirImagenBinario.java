// Crea un programa que copie una imagen en formato .png o .jpg de un archivo a otro, leyéndola como datos binarios. Asegúrate de que el archivo copiado sea idéntico al original.

package datosBinarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class leerEscribirImagenBinario {
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Raúl\\Desktop\\imagen.png";
		String rutaCopia = "C:\\Users\\Raúl\\Desktop\\imagen_copia.png";
		
		try(FileInputStream fis = new FileInputStream(ruta);
			FileOutputStream fos= new FileOutputStream(rutaCopia)) {
		
            byte[] buffer = new byte[1024];
            int bytesLeidos;
            while ((bytesLeidos = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesLeidos);
            }
            System.out.println("Imagen copiada exitosamente.");
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
