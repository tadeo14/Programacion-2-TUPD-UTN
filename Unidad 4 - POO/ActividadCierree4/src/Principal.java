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
        
        // Aplicando actualizaciones de salario
        e1.actualizarSalario(10);      // +10% a Ana
        e2.actualizarSalario(3000.0);  // +3000 fijos a Juan
        e3.actualizarSalario(5);       // +5% a María (salario por defecto aumentado)
        e4.actualizarSalario(1500.0);  // +1500 fijos a Pedro
        
        // Imprimir la información de cada empleado
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        // Mostrar total de empleados creados
        System.out.println("Total empleados creados: " + Empleado.mostrarTotalEmpleados());
    
    
    
    }
    
    
}
