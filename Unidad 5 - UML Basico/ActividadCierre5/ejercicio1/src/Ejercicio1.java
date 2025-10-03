/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear un titular con nombre
    Titular titular = new Titular("Ana López");

    // Crear un pasaporte con número y foto asociada
    Pasaporte pasaporte = new Pasaporte("X12344456", "foto.jpg");

    // Vincular el titular con el pasaporte (solo hace falta un setter 
    // porque la relación es bidireccional)
    titular.setPasaporte(pasaporte);

    // Mostrar el nombre del titular
    System.out.println("Titular: " + titular.getNombre());

    // Mostrar el número del pasaporte del titular
    System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());

    // Mostrar la URL de la foto asociada al pasaporte del titular
    System.out.println("Foto: " + titular.getPasaporte().getFoto().getUrl());
}


    
}
