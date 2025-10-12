/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente c1 = new Contribuyente("Ana Torres", "27-45678901-3");
        Impuesto imp1 = new Impuesto(10000, c1);

        Calculadora calc = new Calculadora();
        calc.calcular(imp1);
    }
    
}
