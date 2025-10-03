/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Foto {
    private String url;   // Atributo privado que guarda la dirección de la foto
    
    // Constructor: recibe la URL al crear el objeto Foto
    public Foto(String url) {
        this.url = url;
    }
    
    // Getter: permite acceder a la URL de la foto desde afuera de la clase
    public String getUrl() {
        return url;
    }
}
