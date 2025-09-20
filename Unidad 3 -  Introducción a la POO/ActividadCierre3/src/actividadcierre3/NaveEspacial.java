/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadcierre3;

/**
 *
 * @author Tadeo
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    int maxCombustible = 100; // límite de carga

    // Despegar
    void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("🚀 La nave " + nombre + " despegó.");
        } else {
            System.out.println("❌ No hay suficiente combustible para despegar.");
        }
    }

    // Avanzar cierta distancia (1 unidad de distancia = 5 de combustible)
    void avanzar(int distancia) {
        int consumo = distancia * 5;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("➡ La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("❌ Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    // Recargar combustible
    void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= maxCombustible) {
            combustible += cantidad;
            System.out.println("⛽ Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            combustible = maxCombustible;
            System.out.println("⛽ Se recargó al máximo. Combustible lleno: " + maxCombustible);
        }
    }

    // Mostrar estado
    void mostrarEstado() {
        System.out.println("Nave: " + nombre +
                           "\nCombustible: " + combustible + "/" + maxCombustible + "\n");
    }
}
