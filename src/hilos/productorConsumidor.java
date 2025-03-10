package hilos;

public class productorConsumidor {
	  public static void main(String[] args) {
	        buffer buffer = new buffer();
	        productor productor = new productor(buffer); 
	        consumidor consumidor = new consumidor(buffer); 
	        productor.start(); 
	        consumidor.start(); 
	    }
}

class buffer{
	
	private int dato;
	private boolean disponible=false;
	
	public synchronized void producir(int valor) throws InterruptedException{
		
		while(disponible) {
			wait();
		}
		
		dato= valor;
		disponible=true;
		System.out.println("Producido: " + valor);
		notify();
	}
	
	public synchronized int consumir() throws InterruptedException{
		while(!disponible) {
			wait();
		}
		disponible = false;
		System.out.println("Consumido: " + dato);
		notify();
		return dato;
	}
}

class productor extends Thread{
	
	private buffer buffer;
	
	public productor(buffer buffer) {
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				 buffer.producir(i); 
	             Thread.sleep(1000); 
			}catch (InterruptedException e) {
                e.printStackTrace();
            }
		}	
	}	
}

class consumidor extends Thread{
	
	private buffer buffer;
	
	public consumidor(buffer buffer) {
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
		try {
			buffer.consumir();
			   Thread.sleep(1000); 
		}catch (InterruptedException e) {
			e.printStackTrace();
	    }		
	}
}	
}






