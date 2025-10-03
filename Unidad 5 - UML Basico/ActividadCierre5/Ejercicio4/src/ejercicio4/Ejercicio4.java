/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.time.LocalDate;

/**
 *
 * @author Tadeo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("Oscar","4525546");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito ("1234-5678-9876-5432", LocalDate.of(2026, 12, 31));
        
        tarjeta.setCliente(cliente1); // Solo un setter necesario
        
        
        
    }
    
}
