/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 * to edit this template
 */
package actividadcierre3;

/**
 *
 * @author Tadeo
 */
public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Setter con validación para añoPublicacion
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025) { // validación simple
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("⚠ Año de publicación inválido: " + añoPublicacion);
        }
    }

    // Método para mostrar la info del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo
                + "\nAutor: " + autor
                + "\nAño de publicación: " + añoPublicacion);
    }
}

