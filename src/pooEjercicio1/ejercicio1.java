/*Crea una clase de llamada Círculoque tenga el atributo de radio (de tipo double). 
La clase debe tener los siguientes métodos:
Un método constructor que recibe la radio como parámetro.
Un método calcularAreaque devuelva el área del círculo.
Un método calcularPerimetroque devuelva el perímetro del círculo.
En el método main, crea un objeto de tipo Círculo, pide al usuario la radio y muestra el área y el perímetro.
 */

package pooEjercicio1;

import java.util.Scanner;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class ejercicio1 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el radio del círculo: ");
	        double radio = scanner.nextDouble();

	        Circulo circulo = new Circulo(radio);

	        System.out.println("Área del círculo: " + circulo.calcularArea());
	        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

	        scanner.close();
	    }

}
