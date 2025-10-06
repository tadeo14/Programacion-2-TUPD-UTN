/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class PlacaMadre {
    private String modelo;   // Atributo privado que guarda la dirección de la foto
    private String chipset; 
    
    
    // Constructor: recibe la URL al crear el objeto Foto
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Getter: permite acceder a la URL de la foto desde afuera de la clase
    public String getModelo() {
        return modelo;
    }
    
    public String getChipset(){
        return chipset;
    }
}
