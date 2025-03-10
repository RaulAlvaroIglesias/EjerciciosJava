/*Crea dos hilos que realizan la suma de números en un rango diferente 
 * (por ejemplo, el primer hilo suma del 1 al 5, y el segundo del 6 al 10). 
 * Utilice una variable compartida para almacenar el resultado final
 *  de la suma y asegúrese de que no haya problemas de sincronización.*/


package hilos;

public class sumaConcurrente {
	
	private int total = 0;
	
	public synchronized void sumar(int valor) {
		total += valor;
	}

    public int getTotal() {
        return total;
    }
    
	public static void main(String[] args) throws InterruptedException {
		
		sumaConcurrente sumaCompartida= new sumaConcurrente(); 
		
		sumarRango hilo1= new sumarRango(0,5,sumaCompartida);
		sumarRango hilo2= new sumarRango(6,10,sumaCompartida);

		hilo1.start();
		hilo2.start();
		
		hilo1.join();
		hilo2.join();

		 System.out.println("Total de la suma: " + sumaCompartida.getTotal());
		
	}	
	
}

class sumarRango extends Thread{
	
	private int inicio, fin;
	
	private sumaConcurrente sumaCompartida;
	
    public sumarRango(int inicio, int fin, sumaConcurrente sumaCompartida) {
        this.inicio = inicio;
        this.fin = fin;
        this.sumaCompartida = sumaCompartida;
    }  
    
    @Override
    public void run() {
    	
    	for(int i= inicio;i<=fin;i++) {
    		sumaCompartida.sumar(i);
    		System.out.println(sumaCompartida.getTotal());
    	}  	
    } 
}




