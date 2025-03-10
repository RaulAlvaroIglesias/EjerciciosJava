
package proyectoSistemasGestionCuentaBancaria;

public class cuentaAhorro extends cuentaBancaria {

	private double interesAnual;
	
	 public cuentaAhorro(String titular, double interesAnual) {
	        super(titular);
	        this.interesAnual = interesAnual;
	 }
	 
	 public void calcularIntereses() {
		 double intereses= consultarSaldo() * (interesAnual / 100);
		 depositar(intereses);
	     System.out.println("Intereses calculados y añadidos al saldo: " + intereses);
	 }
}
