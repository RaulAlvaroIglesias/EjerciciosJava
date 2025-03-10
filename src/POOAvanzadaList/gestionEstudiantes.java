package POOAvanzadaList;

import java.util.ArrayList;
import java.util.List;

public class gestionEstudiantes {

	public List<estudiante> lista;
	
	public gestionEstudiantes() {
		lista=new ArrayList();
	}
	
	public void añadirEstudiante(estudiante estudiante) {
		lista.add(estudiante);
	}
	
	public void mostrarEstudiantes() {
		for(estudiante estudiante:lista) {
			System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
		}
	}
	
	
}
