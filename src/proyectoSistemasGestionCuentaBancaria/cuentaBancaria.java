package proyectoSistemasGestionCuentaBancaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class cuentaBancaria {

	private String titular;
	private double saldo;
	private int numCuenta;
	private ArrayList<transaccion> historial;
	
	public cuentaBancaria(String titular) {
		Random random=new Random();
		this.titular=titular;
		this.saldo=0;
		this.numCuenta=10000000+random.nextInt(99999999-10000000+1);
		this.historial = new ArrayList<>();
	}
	public void depositar(double dinero) {
		if(dinero>0) {
		saldo+=dinero;
		registrarTransaccion("Deposito",dinero);
		}else {
			 System.err.println("La cantidad debe ser mayor que 0.");
		}
	}
	
	public void retirar (double dinero) {
		if(dinero>saldo) {
			System.err.println("No tiene suficiente saldo");
		}else {
			saldo-=dinero;
			registrarTransaccion("Retiro",dinero);
		}
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	 private void registrarTransaccion(String tipo, double cantidad) {
	        historial.add(new transaccion(tipo, cantidad, new Date()));
	    }
	
	public void mostrarHistorial() {
		System.out.println("Historial de transacciones");
		for(transaccion transaccion:historial) {
			System.out.println(transaccion.toString());
		}
	}
	
	
}
