/*Crea un sistema que controle una lista de invitados para una fiesta. 
 * Usa un Set<String> para almacenar los nombres, ya que no se permiten duplicados. 
Implementa métodos para agregar invitados y verificar si un invitado ya está en la lista.

Requisitos:
Usa un Set para almacenar los nombres de los invitados.
Crea un método para agregar invitados.
Crea un método que verifique si un invitado ya está en la lista.
Implementa un sistema que asegure que no haya invitados duplicados.*/

package POOAvanzadaSet;

public class main {
	
	public static void main(String[] args) {
 
        controlInvitados control = new controlInvitados();


        System.out.println("Agregando invitados...");
        control.agregarInvitado("Juan");
        control.agregarInvitado("Maria");
        control.agregarInvitado("Pedro");
        

        boolean agregado = control.agregarInvitado("Maria");
        if (!agregado) {
            System.out.println("Maria ya está en la lista, no se agrega de nuevo.");
        }


        System.out.println("Verificando si Juan está en la lista...");
        if (control.verificarInvitado("Juan")) {
            System.out.println("Juan está en la lista de invitados.");
        } else {
            System.out.println("Juan no está en la lista.");
        }


        System.out.println("Verificando si Ana está en la lista...");
        if (control.verificarInvitado("Ana")) {
            System.out.println("Ana está en la lista de invitados.");
        } else {
            System.out.println("Ana no está en la lista.");
        }

        control.mostrarInvitados();
    }
}
