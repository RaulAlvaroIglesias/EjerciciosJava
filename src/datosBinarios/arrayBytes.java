package datosBinarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class arrayBytes {
	public static void main(String[] args) {
		
		byte[] datos = {10,20,30,40,50};
		String ruta = "C:\\Users\\Raúl\\Desktop\\datos.bin";
		
		try(FileOutputStream fos = new FileOutputStream(ruta)){
			
			fos.write(datos);
			System.out.println("Array de bytes escrito.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(ruta)){
			
			byte[]datosRecu = (byte[]) fis.readAllBytes();
			
			for(int numero:datosRecu) {
				
				System.out.print(numero + " ");
				
			}
					
		}catch(IOException e) {
			e.printStackTrace();	
		}
			
	}

}
