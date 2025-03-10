package proyectoSistemasGestionCuentaBancaria;

public class cuentaCorriente extends cuentaBancaria {
	
	private double lineaCredito;
	
	 public cuentaCorriente(String titular, double lineaCredito) {
	        super(titular);
	        this.lineaCredito = lineaCredito;
	 }
	 
	 
	    public void retirar(double cantidad) {
	        if (cantidad <= consultarSaldo() + lineaCredito) {
	            depositar(-cantidad);
	            System.out.println("Has usado tu línea de crédito.");
	        } else {
	        	System.err.println("No hay suficiente saldo ni crédito disponible.");
	        }
	 
	 	}
}
