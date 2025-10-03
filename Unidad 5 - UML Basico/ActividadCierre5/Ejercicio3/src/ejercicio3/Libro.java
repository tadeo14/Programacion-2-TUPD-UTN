/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Tadeo
 */
public class Libro {
    // Atributos de la clase
    private String titulo;
    private String ISBN;
    private Autor autor;  // Asociación unidireccional: Libro → Autor

    // Constructor que inicializa título y ISBN
    public Libro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    // Setter para asignar un autor al libro
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para mostrar información del libro
    public void mostrar() {
        System.out.println("Libro: " + titulo);
        System.out.println("ISBN: " + ISBN);
        
        // Verificar si se asignó un autor antes de mostrar
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre());
        } else {
            System.out.println("Autor: (no asignado)");
        }
    }
}

