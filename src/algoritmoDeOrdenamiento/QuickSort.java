//Implementa el algoritmo QuickSort para ordenar un arreglo de enteros de forma ascendente.


package algoritmoDeOrdenamiento;

public class QuickSort {
	
	public static int particion(int[] arreglo, int inicio, int fin) {
		int pivote= arreglo[fin];
		int i =inicio-1;
		
		for(int j = inicio; j<fin;j++) {
			if(arreglo[j]<= pivote) {
				i++;
				int temp = arreglo[i];
				arreglo[i] = arreglo[j];
                arreglo[j] = temp;
			}
		}
		
		int temp = arreglo[i+1];
		arreglo[i+1]=arreglo[fin];
		arreglo[fin]= temp;
		
		return i+1;
	}

	public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, pivote - 1);  
            quickSort(arreglo, pivote + 1, fin); 
        }
	}
	
    public static void main(String[] args) {
        int[] arreglo = {34, 7, 23, 32, 5, 62};
        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
	
	
	
}
