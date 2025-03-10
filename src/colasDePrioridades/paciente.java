package colasDePrioridades;

public class paciente implements Comparable<paciente> {

	String nombre;
	int prioridad;
	
	public paciente(String nombre,int prioridad) {
		this.nombre=nombre;
		this.prioridad=prioridad;
	}
	
	
	@Override
	public int compareTo(paciente otro) {
		 return Integer.compare(this.prioridad, otro.prioridad);
	}
	
    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Prioridad: " + prioridad;
    }

}
