/*Crea una aplicación que ejecute dos hilos concurrentes. 
 * Uno de los hilos debe contar de 1 a 5, y el otro de 6 a 10. 
 * Imprima los números en la consola.*/

package hilos;

public class controladorSimpleHilos extends Thread {

	private int inicio;
	private int fin;
	
	public controladorSimpleHilos(int inicio, int fin) {
		this.inicio=inicio;
		this.fin=fin;
	}
	
    public void run() {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
    public static void main(String[] args) {
    	controladorSimpleHilos hilo1 = new controladorSimpleHilos(1, 5);  
    	controladorSimpleHilos hilo2 = new controladorSimpleHilos(6, 10); 

        hilo1.start(); 
        hilo2.start(); 
    }
	
	
}
