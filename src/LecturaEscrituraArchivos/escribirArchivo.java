package LecturaEscrituraArchivos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class escribirArchivo {

	public static void main(String[] args) {
		
		String ruta="C:\\Users\\Raúl\\Desktop\\salida.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
			
			bw.write("Hola mundo");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}	
}
