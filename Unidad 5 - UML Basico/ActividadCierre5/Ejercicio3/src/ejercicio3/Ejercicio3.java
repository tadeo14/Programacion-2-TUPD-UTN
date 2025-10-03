/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Tadeo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear un libro con título y código ISBN
    Libro libro = new Libro("Cien años de soledad", "45211");

    // Crear un autor con nombre y nacionalidad
    Autor autor = new Autor("Julio Verne", "Argentino");

    // Asignar el autor al libro (asociación unidireccional)
    libro.setAutor(autor);

    // Mostrar la información del libro, incluyendo autor
    libro.mostrar();
}
}
