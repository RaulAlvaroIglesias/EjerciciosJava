package LecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buscarPalabraArchivo {

	public static void main(String[] args) {
		
		int contador=0;
		String ruta="C:\\Users\\Raúl\\Desktop\\datos.txt";
		String linea; 
		
		try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
			
			while((linea=br.readLine())!=null) {
				
				String[] palabras = linea.split(" ");
				
				for(String palabra : palabras) {
					
					if(palabra.equalsIgnoreCase("java")) {
						contador++;
					}					
		        }
	         }
			
			 System.out.println("La palabra 'Java' aparece " + contador + " veces.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}	
}


