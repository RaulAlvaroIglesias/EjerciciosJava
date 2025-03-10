package POOAvanzadaMap;

public class main {

	public static void main(String[] args) {
        
        almacenProductos almacen = new almacenProductos();

        
        System.out.println("\nAgregando productos al inventario:");
        almacen.agregarProducto("Manzanas", 50);
        almacen.agregarProducto("Naranjas", 30);
        almacen.agregarProducto("Plátanos", 20);

        
        System.out.println("\nAgregando un producto ya existente:");
        almacen.agregarProducto("Manzanas", 70);  

        
        System.out.println("\nVerificando cantidad de productos:");
        int cantidadNaranjas = almacen.verificarCantidad("Naranjas");
        System.out.println("Cantidad de Naranjas: " + cantidadNaranjas);

        int cantidadPeras = almacen.verificarCantidad("Peras");
        System.out.println("Cantidad de Peras: " + cantidadPeras);  

        
        System.out.println("\nActualizando cantidad de productos:");
        almacen.actualizarCantidad("Plátanos", 50);  

        
        almacen.actualizarCantidad("Peras", 10);  

        
        almacen.mostrarInventario();
    }
}
