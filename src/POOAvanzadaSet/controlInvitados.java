package POOAvanzadaSet;

import java.util.HashSet;
import java.util.Set;

public class controlInvitados {
	private Set<String>lista;
	
	public controlInvitados() {
		lista=new HashSet<>();
	}
	
	public boolean agregarInvitado(String nombre) {
		return lista.add(nombre);
	}
	
	public boolean verificarInvitado(String nombre) {
		return lista.contains(nombre);
	}
	
	void mostrarInvitados() {
		System.out.println("\n"+"Lista invitados:");
		for(String invitado:lista) {
			 System.out.println(invitado);
		}
	}
}