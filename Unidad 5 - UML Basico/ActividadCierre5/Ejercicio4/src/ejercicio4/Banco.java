/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Tadeo
 */
public class Banco {
    private String nombre;
    private String cuit;
    private TarjetaDeCredito tarjeta;
    
    
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public void mostrar() {
        System.out.println("Banco: " + nombre + " - CUIT: " +
        cuit);
        }

    
}
