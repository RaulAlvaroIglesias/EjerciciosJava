/*Escribe un programa que realice una búsqueda lineal en un arreglo de enteros. 
 * El programa debe recibir un número y devolver la posición en la que se encuentra dicho número, 
 * o indicar que no se encontró.*/



package algoritmosDeBusqueda;

public class busquedaLineal {
		
	  public static int busquedaLineal(int[] arreglo, int clave) {
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] == clave) {
	                return i;
	            }
	        }
	        return -1; 
	    }
	  
	    public static void main(String[] args) {
	        int[] arreglo = {10, 23, 45, 70, 11, 15};
	        int clave = 70;

	        int resultado = busquedaLineal(arreglo, clave);
	        if (resultado != -1) {
	            System.out.println("Elemento encontrado en el índice: " + resultado);
	        } else {
	            System.out.println("Elemento no encontrado.");
	        }
	    }
}
