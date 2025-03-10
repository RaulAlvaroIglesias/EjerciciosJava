package sistemaTransferenciaBancariaConcurrente;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class maain {
	 public static void main(String[] args) {
	        // Crear algunas cuentas bancarias
	        cuentaBancaria cuenta1 = new cuentaBancaria("1001", 5000);
	        cuentaBancaria cuenta2 = new cuentaBancaria("1002", 3000);
	        cuentaBancaria cuenta3 = new cuentaBancaria("1003", 7000);

	        // Crear un pool de hilos usando ExecutorService
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        // Simular varias transferencias entre cuentas
	        executor.submit(new transferenciaBancaria(cuenta1, cuenta2, 1000));
	        executor.submit(new transferenciaBancaria(cuenta2, cuenta3, 500));
	        executor.submit(new transferenciaBancaria(cuenta3, cuenta1, 2000));
	        executor.submit(new transferenciaBancaria(cuenta1, cuenta3, 300));
	        executor.submit(new transferenciaBancaria(cuenta2, cuenta1, 1500));

	        // Cerrar el pool de hilos
	        executor.shutdown();

	        try {
	            // Esperar a que todas las transferencias finalicen
	            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
	                executor.shutdownNow();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Imprimir saldos finales
	        cuenta1.imprimirDatos();
	        cuenta2.imprimirDatos();
	        cuenta3.imprimirDatos();
	    }
}
