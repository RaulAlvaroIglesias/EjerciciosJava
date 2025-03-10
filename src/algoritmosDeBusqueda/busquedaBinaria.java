/*Implementa un algoritmo de búsqueda binaria en un arreglo ordenado de enteros. 
 * Dado un número, el programa debe devolver la posición del número en el arreglo, o -1 si no se encuentra.*/


package algoritmosDeBusqueda;

public class busquedaBinaria {
	
	public static int busquedaBinaria(int[] arreglo, int clave) {
		int inicio=0, fin=arreglo.length-1;
		
		while(inicio<=fin) {
			int medio=inicio+(fin-inicio)/2;

			if(arreglo[medio]==clave) {
				return medio;
			}else if(arreglo[medio]< clave) {
				inicio=medio+1;
			}else {
				fin=medio-1;
			}
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		
        int[] arreglo = {10, 20, 30, 40, 50, 60};
        int clave = 30;
        
        int resultado= busquedaBinaria(arreglo,clave);
        
        if(resultado!=-1) {
        	System.out.println("Elemento encontrado en el índice: " + resultado);
        }else {
        	System.out.println("Elemento no encontrado.");
        }
			
	}
}
