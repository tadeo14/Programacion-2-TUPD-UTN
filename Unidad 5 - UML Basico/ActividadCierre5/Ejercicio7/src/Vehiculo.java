/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase Vehiculo: representa un vehículo que posee un motor
// y está asociado con un conductor.
public class Vehiculo {
    private String patente;        // Patente del vehículo
    private String modelo;         // Modelo del vehículo
    private Motor motor;           // Relación de agregación con Motor
    private Conductor conductor;   // Relación bidireccional con Conductor

    // Constructor que recibe la patente, modelo y motor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Setter para establecer el conductor del vehículo
    // Se establece también la relación inversa (bidireccional)
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this); // El conductor también "conoce" al vehículo
    }

    // Getter usado por Conductor para mostrar datos
    public String getPatente() {
        return patente;
    }

    // Método para mostrar todos los datos del vehículo
    public void mostrar() {
        System.out.println("Vehículo: " + patente + " - Modelo: " + modelo);

        // Muestra el motor si está asociado
        if (motor != null) {
            motor.mostrar();
        }

        // Muestra el conductor si existe
        if (conductor != null) {
            System.out.println("Conductor asignado: " + conductor.getNombre());
        }
    }
}

