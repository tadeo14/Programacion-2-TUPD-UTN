package actividadcierre3;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
     void mostrarInfo(){
    
        System.out.println(nombre + " \n" + especie + "\n" + edad);
    
    }
     void cumplirAnios() {
    Scanner input = new Scanner(System.in);
     
    
    System.out.println("Teimpo a simular: ");
    int anios = input.nextInt();
    
    edad = edad + anios;
    
    
    System.out.println("Nueva edad " + edad);
            
}
    
    
}
