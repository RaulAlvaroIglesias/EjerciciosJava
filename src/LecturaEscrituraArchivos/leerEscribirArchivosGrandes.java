//lee y copia el archivo DonQuijote.txt


package LecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class leerEscribirArchivosGrandes {
	
	public static void main(String[] args) {
		
		String rutaLibro = "C:\\Users\\Raúl\\Desktop\\DonQuijote.txt";
		String rutaCopia = "C:\\Users\\Raúl\\Desktop\\copia.txt";
		String linea;
		int contador=0;
		
		try( BufferedReader br = new BufferedReader(new FileReader(rutaLibro));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(rutaCopia))){
			
			while((linea=br.readLine())!=null){
				
				bw.write(linea);
				bw.newLine();
				contador++;
				System.out.println("Lineas copiadas: "+contador);
			}
			
			br.close();
			bw.close();
			
			
			System.out.println("Archivo copiado exitosamente");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}
