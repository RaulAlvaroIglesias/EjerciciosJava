/*Crea un sistema para gestionar estudiantes de una clase. Implementa una interfaz Persona que define métodos
 *  para obtener el nombre y la edad. Crea una clase Estudiante que implemente la interfaz. 
 *  Usa una lista (List<Estudiante>) para almacenar y mostrar la lista de estudiantes.

Requisitos:
Implementa una interfaz Persona.
Crea la clase Estudiante que implemente la interfaz.
Crea un método para agregar estudiantes a una lista.
Crea un método que recorra la lista e imprima los nombres y edades de los estudiantes.*/

package POOAvanzadaList;

public class main {

	  public static void main(String[] args) {
	        gestionEstudiantes gestion = new gestionEstudiantes();


	        gestion.añadirEstudiante(new estudiante("Ana", 20));
	        gestion.añadirEstudiante(new estudiante("Luis", 22));
	        gestion.añadirEstudiante(new estudiante("Carlos", 21));


	        gestion.mostrarEstudiantes();
	    }
}
