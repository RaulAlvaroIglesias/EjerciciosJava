package gestionEmpleadosSQL;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
		
		empleadoDAO empleadoDao = new empleadoDAO();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("---- Sistema de Gestión de Empleados ----");
            System.out.println("1. Crear nuevo empleado");
            System.out.println("2. Listar todos los empleados");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
			
			switch(opcion) {
			
			case 1:
				System.out.print("Nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.print("Salario del empleado: ");
                double salario = scanner.nextDouble();
                
                empleado nuevoEmpleado = new empleado(nombre, salario);
                
                try {
                	
                	empleadoDao.crearEmpleado(nuevoEmpleado);
                	
                }catch (SQLException e) {
                    System.out.println("Error al crear empleado: " + e.getMessage());
                }
                break;
                
            case 2:
                
                try {
                    List<empleado> empleados = empleadoDAO.obtenerTodosLosEmpleados();
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados.");
                    } else {
                        for (empleado empleado : empleados) {
                            System.out.println(empleado);
                        }
                    }
                } catch (SQLException e) {
                    System.out.println("Error al obtener empleados: " + e.getMessage());
                }
                break;
				
             case 3:
            	
                 System.out.print("ID del empleado a actualizar: ");
                 int idnuevo = scanner.nextInt();
                 scanner.nextLine(); 
                 System.out.print("Nuevo nombre: ");
                 String nuevoNombre = scanner.nextLine();
                 System.out.print("Nuevo salario: ");
                 double nuevoSalario = scanner.nextDouble();
			
                 empleado empleadoActualizado = new empleado(idnuevo, nuevoNombre, nuevoSalario);
                 
                 try {
                	 
                	empleadoDao.actualizarEmpleado(empleadoActualizado);
                	 
                 }catch (SQLException e) {
                     System.out.println("Error al actualizar empleado: " + e.getMessage());
                 }
                 break;
                 
             case 4:
            	 
                 System.out.print("ID del empleado a eliminar: ");
                 int idEliminar = scanner.nextInt();
                 
                 try {
                	 
                     empleadoDao.eliminarEmpleado(idEliminar);
                     
                 } catch (SQLException e) {
                     System.out.println("Error al eliminar empleado: " + e.getMessage());
                 }
                 break;

             case 5:
            	 
                 System.out.println("Saliendo del sistema...");
                 break;

             default:
                 System.out.println("Opción no válida.");
                 break;
             
			}
						
		}while(opcion!=5);
		
		scanner.close();
			
	}
}
