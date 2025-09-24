/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tadeo
 */
public class Principal {
    
    public static void main(String[] args) {
    
    // Instanciando usando constructor completo
        Empleado e1 = new Empleado(10, "Ana García", "Analista", 55000.0);
        Empleado e2 = new Empleado(11, "Juan Pérez", "Desarrollador", 72000.0);
    
    // Instanciando usando constructor con nombre y puesto (id automático, salario por defecto)
        Empleado e3 = new Empleado("María López", "Soporte");
        Empleado e4 = new Empleado("Pedro Gómez", "RRHH");
    
    
    
    
    }
    
    
}
