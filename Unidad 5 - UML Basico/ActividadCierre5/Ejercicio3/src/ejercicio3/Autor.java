/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Tadeo
 */
public class Autor {
    // Atributos privados de la clase
    private String nombre;
    private String nacionalidad;

    // Constructor que inicializa nombre y nacionalidad
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getter para el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // Getter para la nacionalidad del autor
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Método opcional para mostrar información del autor
    public void mostrar() {
        System.out.println("Autor: " + nombre + " - Nacionalidad: " + nacionalidad);
    }
}
