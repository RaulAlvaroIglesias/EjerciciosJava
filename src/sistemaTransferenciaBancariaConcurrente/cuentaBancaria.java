package sistemaTransferenciaBancariaConcurrente;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class cuentaBancaria {
	
	private String id;
	private double saldo;
	private final Lock lock = new ReentrantLock();

    public cuentaBancaria(String id, double saldoInicial) {
        this.id = id;
        this.saldo = saldoInicial;
    }
    
    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public Lock getLock() {
        return lock;
    }
	
    public synchronized void imprimirDatos() {
    	 System.out.println("Cuenta " + id + " saldo actual: " + saldo);
    }
	
}
