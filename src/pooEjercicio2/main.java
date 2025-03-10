/*
Crea una clase de llamada CuentaBancariasiguiente que tenga los atributos:
titular (de tipo String)
saldo (de tipo double)
La clase debe tener los siguientes métodos:

Un constructor que recibe el nombre del titular y el saldo inicial.
Un método depositar que reciba una cantidad y la suma al saldo.
Un método retirar que reciba una cantidad y el resto del saldo solo si hay suficiente dinero, de lo contrario, debe mostrar un mensaje de error.
Un método consultarSaldo que devuelva el saldo actual.
En el método main, crea un objeto de tipo CuentaBancariay realiza operaciones de depósito y retiro.

*/
package pooEjercicio2;

public class main {
	
	   public static void main(String[] args) {

	        cuentaBancaria cuenta = new cuentaBancaria("Juan Pérez", 1000.0);

	        cuenta.depositar(500);
	        System.out.println("Saldo después del depósito: " + cuenta.consultarSaldo());

	        cuenta.retirar(300);
	        System.out.println("Saldo después del retiro: " + cuenta.consultarSaldo());

	        cuenta.retirar(1500);
	    }

}
