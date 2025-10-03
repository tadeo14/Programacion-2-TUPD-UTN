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
    private Usuario usuario;

    // Constructor: inicializa todos los atributos
    public Celular(String imei, String marca, String modelo,Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario (Usuario usuario){
        this.usuario = usuario;
    }
    
    // Método para mostrar información
    public void mostrar() {
        System.out.println("Celular:");
        System.out.println("Usuario: " + usuario.getNombre() + " - DNI: " + usuario.getDni());
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Batería - Modelo: " + bateria.getModelo() + 
                           ", Capacidad: " + bateria.getCapacidad());
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    

    
}

