

package NIO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class monitorearCambiosDirectorio {
	public static void main(String[] args) {
		
		
		try {
		
		WatchService watchService = FileSystems.getDefault().newWatchService();
		String ruta= "C:\\Users\\Raúl\\Desktop\\directorio";
		Path path = Paths.get(ruta);
		
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, 
                StandardWatchEventKinds.ENTRY_DELETE, 
                StandardWatchEventKinds.ENTRY_MODIFY);
		
        System.out.println("Monitoreando directorio: " + path.toAbsolutePath());

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Evento detectado: " + event.kind() + " en archivo: " + event.context());
            }
            key.reset();
        }
		
		}catch(IOException | InterruptedException e) {
            e.printStackTrace();
            
		}
		
		
		
	}

}
