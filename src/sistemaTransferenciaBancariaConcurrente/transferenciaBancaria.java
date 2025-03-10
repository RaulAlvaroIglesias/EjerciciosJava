package sistemaTransferenciaBancariaConcurrente;

public class transferenciaBancaria implements Runnable {
    private cuentaBancaria origen;
    private cuentaBancaria destino;
    private double monto;
    
    public transferenciaBancaria(cuentaBancaria origen, cuentaBancaria destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }
    
    private void transferir() {
        if (origen.getSaldo() >= monto) {
            origen.retirar(monto);
            destino.depositar(monto);
            System.out.println(Thread.currentThread().getName() +
                    " ha transferido " + monto + " desde la cuenta " + origen.getId() + " a la cuenta " + destino.getId());
        } else {
            System.out.println("Saldo insuficiente en la cuenta " + origen.getId() + " para transferir " + monto);
        }
    }
      
    @Override
    public void run() {
        try {
            if (origen.getId().compareTo(destino.getId()) < 0) {
                synchronized (origen) {
                    synchronized (destino) {
                    	transferir();
                    }
                }
            } else {
                synchronized (destino) {
                    synchronized (origen) {
                        transferir();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
