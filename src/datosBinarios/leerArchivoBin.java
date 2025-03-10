package datosBinarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class leerArchivoBin {

	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Raúl\\Desktop\\numeros.bin";
		
		try(FileInputStream fis = new FileInputStream(ruta)){
			
			int numero = (int) fis.read();
			 System.out.println("Número leído: " + numero);
				
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
