/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Tadeo
 */
// Tiene una relación de COMPOSICIÓN con FirmaDigital.
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición: el documento "posee" la firma

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Método para agregar una firma digital al documento
    public void firmarDocumento(String codigoHash, String fecha, Usuario usuario) {
        this.firma = new FirmaDigital(codigoHash, fecha, usuario); // la firma nace con el documento
    }

    public void mostrar() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        if (firma != null) {
            firma.mostrar();
        }
    }
}
