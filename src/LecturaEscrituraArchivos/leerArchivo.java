//Escribe un programa que lea un archivo de texto llamado datos.txt y muestre su contenido en la consola, línea por línea.

package LecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leerArchivo {

	public static void main(String[] args) {

		String ruta="C:\\Users\\Raúl\\Desktop\\datos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
			String linea;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			
		}catch (IOException e) {
            e.printStackTrace();
		}
	}
}
