package LecturaEscrituraArchivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class contarLineasArchivo {
	
	public static void main(String[] args) {
		
		int contador=0;
		String ruta= "C:\\Users\\Raúl\\Desktop\\datos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
			
			while(br.readLine()!=null) {
				contador++;
			}		
			
			System.out.println("El archivo datos.txt tiene "+contador+" lineas.");	
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
