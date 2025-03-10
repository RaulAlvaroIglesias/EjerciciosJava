package pooEjercicio3;

public class empleado {
	
	 protected String nombre;
	    protected double sueldo;

	    public empleado(String nombre, double sueldo) {
	        this.nombre = nombre;
	        this.sueldo = sueldo;
	    }

	    public void mostrarInfo() {
	        System.out.println("Empleado: " + nombre + ", Sueldo: " + sueldo);
	    }

}
