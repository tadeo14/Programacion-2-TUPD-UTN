/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Computadora {
    // Atributos privados
    private String numero;   // Número de serie único del pasaporte
    private String marca;      
    private PlacaMadre placamadre;
    private Propietario propietario;
    
    
    public Computadora(String numero, String marca, String modelo, String chipset) {
    this.numero = numero;
    this.marca = marca;
    this.placamadre = new PlacaMadre(modelo,chipset);
    }
    
    public void setPropietario (Propietario propietario) {
        this.propietario = propietario;
    }

   
    public Propietario getPropietario() {
        return propietario;
    }
    
  
    
    public void mostrar() {
        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Numero PC: " + numero);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo Placa madre: " + placamadre.getModelo());
        System.out.println("ChipSet: " + placamadre.getChipset());
    }

    
}
