package datosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class leerEscribirDatosMixtos {
	public static void main(String[] args) {
	
		String ruta = "C:\\Users\\Raúl\\Desktop\\mixtos.bin";
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta))) {
			
			dos.writeInt(42);
			dos.writeFloat(3.14f);
			dos.writeChar('A');
			System.out.println("Datos mixtos escritos.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {
			
			int numero = dis.readInt();
			float flotante = dis.readFloat();
			char caracter = dis.readChar();
			
			System.out.println("Entero: " + numero);
            System.out.println("Flotante: " + flotante);
            System.out.println("Carácter: " + caracter);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
