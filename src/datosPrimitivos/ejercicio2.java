/*Escribe un programa que solicite dos números 
enteros y muestre su suma, resta, multiplicación 
y división.*/

package datosPrimitivos;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero a operar:");
		double num1= scanner.nextDouble();
		
		System.out.println("Introduce el segundo numero a operar:");
		double num2= scanner.nextDouble(); 
		
		double suma=num1+num2;
		double resta=num1-num2;
		double multi=num1*num2;
		double divi=num1/num2;
		
		System.out.println("RESULTADOS"+"\n"
				+ "- SUMA= "+suma+"\n"
				+ "- RESTA= "+resta+"\n"
				+ "- MULTIPLICACION= "+multi +"\n"
				+ "- DIVISION= "+divi+"\n");
		
		scanner.close();
		
	}

}
