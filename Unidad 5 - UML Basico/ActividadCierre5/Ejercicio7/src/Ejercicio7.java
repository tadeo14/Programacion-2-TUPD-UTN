/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un motor
        Motor motor1 = new Motor("Nafta", "A12345");

        // Crear un vehículo que agrega el motor
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota Corolla", motor1);

        // Crear un conductor
        Conductor conductor1 = new Conductor("Juan Pérez", "LIC9876");

        // Establecer la asociación bidireccional entre vehículo y conductor
        vehiculo1.setConductor(conductor1);

        // Mostrar los datos de cada objeto
        System.out.println("=== Datos del Vehículo ===");
        vehiculo1.mostrar();

        System.out.println("\n=== Datos del Conductor ===");
        conductor1.mostrar();
    }
    
}
