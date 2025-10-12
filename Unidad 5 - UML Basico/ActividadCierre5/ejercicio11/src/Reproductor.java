/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase Reproductor: depende de la clase Cancion en su método, pero no la guarda como atributo.
public class Reproductor {
    public void reproducir(Cancion cancion) { // Dependencia de uso
        System.out.println("Reproduciendo...");
        cancion.mostrar();
    }
}
