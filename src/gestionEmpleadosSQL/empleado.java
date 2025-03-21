package gestionEmpleadosSQL;

public class empleado {
	
	private int id;
	private String nombre;
	private double salario;
	
	public empleado(String nombre, double salario) {
		this.nombre=nombre;
		this.salario=salario;
	}
	
	public empleado(int id,String nombre, double salario) {
		this.id=id;
		this.nombre=nombre;
		this.salario=salario;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado:" + id + ", " + nombre + ", " + salario;
    }
}


