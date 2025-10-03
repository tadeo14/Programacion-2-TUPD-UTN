/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Celular {
    // Atributos de la clase
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;

    // Constructor: inicializa todos los atributos
    public Celular(String imei, String marca, String modelo,Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    // Método para mostrar información
    public void mostrar() {
        System.out.println("Celular:");
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Batería - Modelo: " + bateria.getModelo() + 
                           ", Capacidad: " + bateria.getCapacidad());
    }
    

    
}

