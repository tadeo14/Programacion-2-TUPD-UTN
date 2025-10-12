/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Tadeo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Laura Gómez", "laura@example.com");
        Documento doc1 = new Documento("Contrato", "Contenido del contrato de servicios...");

        doc1.firmarDocumento("ABC123XYZ", "2025-10-11", usuario1);

        System.out.println("=== Datos del Documento ===");
        doc1.mostrar();
    }
    
}
