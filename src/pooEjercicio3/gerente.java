package pooEjercicio3;

public class gerente extends empleado {
    
    private String departamento;


    public gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: " + nombre + ", Sueldo: " + sueldo + ", Departamento: " + departamento);
    } 

}
