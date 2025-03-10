/*Crea un hilo que simule la descarga de un archivo.
 *  El hilo debe imprimir el progreso de la descarga del 0% al 100%
 *   en incrementos de 10%, con una pausa de 1 segundo entre cada 
 *   incremento.*/


package hilos;

public class simulacionProceso extends Thread {
	@Override
	public void run() {
		
		for(int i=0;i<=100;i+=10) {
			 System.out.println("Descargando: " + i + "%");
			 
			 try {
				 Thread.sleep(1000);
			 }catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}	
		System.out.println("Descarga completada.");			
	}
	 
	
	public static void main(String[] args) {
		
		simulacionProceso descarga= new simulacionProceso();
		descarga.start();	
	}	
}
