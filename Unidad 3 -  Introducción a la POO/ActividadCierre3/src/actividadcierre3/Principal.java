/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadcierre3;

/**
 *
 * @author Tadeo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante Carlos = new Estudiante();
        
        Carlos.nombre = "Carlos";
        Carlos.apellido = "Aranda";
        Carlos.curso = "5A";
        Carlos.calificacion = 4;
        
        Carlos.mostrarInfo();
        Carlos.bajarCalificacion();
        Carlos.subirCalificacion();      
        
        
    }
    
}
