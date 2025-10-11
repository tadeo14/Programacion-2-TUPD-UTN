/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Tadeo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un cliente y mesa
        Cliente cliente1 = new Cliente("Tadeo Acosta", "342-5234423");
        Mesa mesa1 = new Mesa(7, 4);


       // Crear reserva (la mesa se pasa por agregación)
        Reserva reserva1 = new Reserva(LocalDate.of(2025, 10, 11), LocalTime.of(20, 30), mesa1);

       // Asociar cliente a la reserva
        reserva1.setCliente(cliente1);

        // Mostrar información completa
        reserva1.mostrar();
    
}
}