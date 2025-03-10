package POOAvanzadaMap;

import java.util.HashMap;
import java.util.Map;

public class almacenProductos {

	public Map<String, Integer> inventario;
	
	public almacenProductos() {
		inventario= new HashMap<>();
	}
	
    public void agregarProducto(String producto, int cantidad) {
        inventario.put(producto, cantidad);
        System.out.println("Producto " + producto + " agregado/actualizado con cantidad: " + cantidad);
    }
	
    public void actualizarCantidad(String producto, int nuevaCantidad) {
        if (inventario.containsKey(producto)) {
            inventario.put(producto, nuevaCantidad);
            System.out.println("Cantidad del producto " + producto + " actualizada a: " + nuevaCantidad);
        } else {
            System.out.println("El producto " + producto + " no se encuentra en el inventario.");
        }
    }
    
    public int verificarCantidad(String producto) {
        return inventario.getOrDefault(producto, 0); 
    }
    
    public void mostrarInventario() {
        System.out.println("\n"+"Inventario de la tienda:");
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                System.out.println("Producto: " + entry.getKey() + ", Cantidad: " + entry.getValue());
            }
        }
    
    }
}
