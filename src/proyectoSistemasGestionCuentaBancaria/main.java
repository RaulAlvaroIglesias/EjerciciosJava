package proyectoSistemasGestionCuentaBancaria;
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		cuentaBancaria cuenta = null;
		
		
		try {
		 System.out.println("¿Qué tipo de cuenta desea crear? 1. Ahorro  2. Corriente");
		 int opcion=scanner.nextInt();
		 scanner.nextLine();
		 
		 System.out.print("Introduce el nombre del titular: ");
         String titular = scanner.nextLine();
         
         if (opcion == 1) {
             System.out.print("Introduce el interés anual (%): ");
             double interes = scanner.nextDouble();
             cuenta = new cuentaAhorro(titular, interes);
         } else if (opcion == 2) {
             System.out.print("Introduce la línea de crédito: ");
             double credito = scanner.nextDouble();
             cuenta = new cuentaCorriente(titular, credito);
         }
		
         boolean salir = false;
		
         while (!salir) {
             System.out.println("\nOpciones: 1. Depositar  2. Retirar  3. Consultar saldo  4. Ver historial  5. Salir");
             int eleccion = scanner.nextInt();

             switch (eleccion) {
                 case 1:
                     System.out.print("Introduce la cantidad a depositar: ");
                     double deposito = scanner.nextDouble();
                     cuenta.depositar(deposito);
                     break;
                 case 2:
                     System.out.print("Introduce la cantidad a retirar: ");
                     double retiro = scanner.nextDouble();
                     try {
                         cuenta.retirar(retiro);
                     } catch (Exception e) {
                         System.out.println(e.getMessage());
                     }
                     break;
                 case 3:
                     System.out.println("El saldo actual es: " + cuenta.consultarSaldo());
                     break;
                 case 4:
                     cuenta.mostrarHistorial();
                     break;
                 case 5:
                     salir = true;
                     break;
                 default:
                     System.out.println("Opción no válida.");
             }
         }   
		}finally {
			scanner.close();
		}
	}
}

