/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadcierre3;

import java.util.Scanner;

/**
 *
 * @author Tadeo
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo(){
    
        System.out.println(nombre + " \n" + apellido + curso+"\n" + curso + "\n" + calificacion);
    
    }
     void bajarCalificacion() {
    Scanner input = new Scanner(System.in);
     
    
    System.out.println("Puntos a bajar: ");
    int puntos = input.nextInt();
    
    calificacion = calificacion - puntos;
    
    if (calificacion < 0) {
            calificacion = 0;
        }
    
    System.out.println("Nueva calificacion " + calificacion);
            
}
    void subirCalificacion() {
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Puntos a subir: ");
    int puntos = input.nextInt();
    
    calificacion = calificacion + puntos;
    
    if (calificacion > 10) {
            calificacion = 10;
        }
    
    System.out.println("Nueva calificacion " + calificacion);
            
}
  }
