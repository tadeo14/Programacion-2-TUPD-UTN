/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadcierre3;

/**
 *
 * @author Tadeo
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    // Método para poner un huevo
    void ponerHuevo() {
        huevosPuestos++;
        System.out.println("🐔 La gallina " + idGallina + " puso un huevo.");
    }

    // Método para envejecer
    void envejecer() {
        edad++;
        System.out.println("📅 La gallina " + idGallina + " cumplió un año más.");
    }

    // Mostrar estado
    void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina +
                           "\nEdad: " + edad +
                           "\nHuevos puestos: " + huevosPuestos + "\n");
    }
}

