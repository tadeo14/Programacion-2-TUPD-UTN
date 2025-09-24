/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tadeo
 */
public class Empleado {
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributos estáticos para control global
    private static int totalEmpleados = 0;
    private static int siguienteId = 1; // para asignar id automático
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        // Aseguro que siguienteId siga siendo mayor que cualquier id manual dado
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }
    
    // Constructor que recibe solo nombre y puesto (id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 40000.0; // salario por defecto
        totalEmpleados++;
    }
    
    // Métodos sobrecargados para actualizar salario

    // a) recibe porcentaje (ej: 10 significa +10%)
    public void actualizarSalario(int porcentaje) {
        if (porcentaje <= 0) return;
        double aumento = this.salario * porcentaje / 100.0;
        this.salario += aumento;
    }
    
    
}
