package datosBinarios;

import java.io.FileOutputStream;
import java.io.IOException;

public class escribirArchivoBin {
	
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Raúl\\Desktop\\numeros.bin";
		
		try(FileOutputStream fos = new FileOutputStream(ruta)){
			
			fos.write(42);
			System.out.println("Número binario escrito.");
				
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
