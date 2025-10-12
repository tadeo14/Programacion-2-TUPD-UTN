/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase Conductor: representa una persona que conduce un vehículo.
// Tiene una relación bidireccional con Vehiculo.
public class Conductor {
    private String nombre;       // Nombre del conductor
    private String licencia;     // Número de licencia del conductor
    private Vehiculo vehiculo;   // Referencia al vehículo que conduce

    // Constructor que inicializa nombre y licencia
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Setter para vincular un vehículo al conductor
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Getter usado por Vehiculo para acceder al nombre
    public String getNombre() {
        return nombre;
    }

    // Método para mostrar los datos del conductor
    public void mostrar() {
        System.out.println("Conductor: " + nombre + " - Licencia: " + licencia);

        // Si el conductor tiene un vehículo asignado, se muestra la patente
        if (vehiculo != null) {
            System.out.println("Conduce el vehículo: " + vehiculo.getPatente());
        }
    }
}

