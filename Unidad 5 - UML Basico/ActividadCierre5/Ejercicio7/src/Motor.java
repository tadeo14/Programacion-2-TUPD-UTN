/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase Motor: representa el motor de un vehículo.
// Esta clase formará parte de una relación de AGREGACIÓN con Vehículo.
public class Motor {
    private String tipo;          // Tipo de motor (ej: Nafta, Diesel, Eléctrico)
    private String numeroSerie;   // Número de serie único del motor

    // Constructor que inicializa los atributos del motor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Método para mostrar los datos del motor
    public void mostrar() {
        System.out.println("Motor: " + tipo + " - Nº Serie: " + numeroSerie);
    }
}

