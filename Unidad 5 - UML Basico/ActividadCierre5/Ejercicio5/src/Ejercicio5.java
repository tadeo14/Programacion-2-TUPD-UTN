/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario propietario = new Propietario ("Oscar","4525546");
        Computadora computadora = new Computadora("A154211-5", "Samnsung","gx1050","Z790");
        
        
        computadora.setPropietario(propietario); // Solo un setter necesario
        
        
        computadora.mostrar();
     }
    
}
