package proyectoSistemasGestionCuentaBancaria;
import java.util.Date;
public class transaccion {

	private String tipo;
    private double cantidad;
    private Date fecha;

 
    public transaccion(String tipo, double cantidad, Date fecha) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return tipo + ": " + cantidad + " en " + fecha;
    }
	
}
