package POOAvanzadaList;

public class estudiante implements persona{
	
	private String nombre;
	private int edad;
	
    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
	
	

	@Override
	public String getNombre() {
		return nombre;
		
	}

	@Override
	public int getEdad() {
		return edad;
	}
	
	

}
