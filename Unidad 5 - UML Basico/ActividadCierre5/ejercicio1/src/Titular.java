/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Titular {
    private String nombre;         // Nombre del titular
    private Pasaporte pasaporte;   // Asociación con un objeto Pasaporte

    // Constructor: recibe el nombre del titular
    public Titular(String nombre) {
        this.nombre = nombre;
    }

    // Asocia un pasaporte al titular
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;

        // Asegura la relación bidireccional:
        // Si el pasaporte no es nulo y aún no está vinculado con este titular,
        // lo asocia de vuelta llamando a setTitular en Pasaporte
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    // Devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }

    // Devuelve el pasaporte asociado al titular
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}

