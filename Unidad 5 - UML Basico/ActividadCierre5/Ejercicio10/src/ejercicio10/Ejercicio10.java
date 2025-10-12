/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Tadeo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular1 = new Titular("Carlos López", "40123456");
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890123456789012", 250000.50, "ABC123", "2025-10-11");
        cuenta1.setTitular(titular1);

        System.out.println("=== Datos de la Cuenta ===");
        cuenta1.mostrar();

        System.out.println("\n=== Datos del Titular ===");
        titular1.mostrar();
    }
    
}
