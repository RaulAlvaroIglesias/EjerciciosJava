package pooEjercicio2;

public class cuentaBancaria {
	
    private String titular;
    private double saldo;

    public cuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Error: Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

}
