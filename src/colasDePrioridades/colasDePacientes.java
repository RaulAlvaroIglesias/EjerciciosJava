package colasDePrioridades;

import java.util.PriorityQueue;

public class colasDePacientes {

	public static void main(String[] args) {

        PriorityQueue<paciente> colaDePacientes = new PriorityQueue<>();


        colaDePacientes.add(new paciente("Juan", 2));
        colaDePacientes.add(new paciente("Ana", 3)); 
        colaDePacientes.add(new paciente("Carlos", 1));


        System.out.println("Procesando pacientes en orden de prioridad:");
        while (!colaDePacientes.isEmpty()) {
            System.out.println(colaDePacientes.poll()); 
        }
    }
}
