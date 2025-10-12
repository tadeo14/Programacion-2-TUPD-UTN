/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase Calculadora: depende de Impuesto en su método calcular (no la guarda como atributo).
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando monto total con recargo del 21%...");
        double total = impuesto.getMonto() * 1.21;
        System.out.println("Total con IVA: $" + total);
    }
}
