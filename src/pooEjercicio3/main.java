/*
Crea una clase base llamada Empleadoque tenga los atributos:
nombre (de tipo String)
sueldo (de tipo double)
La clase debe tener un constructor que inicialice ambos atributos y un método llamado mostrarInfo que imprime la información del empleado.
Luego, crea una clase derivada llamada Gerenteque herede de Empleadoy que tiene un atributo adicional:
departamento (de tipo String)
La clase Gerentedebe sobrescribir el método mostrarInfopara incluir el departamento. En el método main, crea objetos de ambas clases y muestra su información.
*/

package pooEjercicio3;

public class main {

	 public static void main(String[] args) {
	        
	        empleado empleado = new empleado("Carlos Gómez", 2500.0);
	        empleado.mostrarInfo();

	      
	        gerente gerente = new gerente("Ana Sánchez", 5000.0, "Ventas");
	        gerente.mostrarInfo();
	    }
}
