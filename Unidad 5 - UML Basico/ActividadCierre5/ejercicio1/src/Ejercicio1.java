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
        Titular titular = new Titular("Ana López");
        Pasaporte pasaporte = new Pasaporte("X12344456","foto.jpg" );
        titular.setPasaporte(pasaporte); // Solo un setter necesario
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte: " +titular.getPasaporte().getNumero());
        System.out.println("Foto: " +titular.getPasaporte().getFoto().getUrl());
        

 }

    
}
