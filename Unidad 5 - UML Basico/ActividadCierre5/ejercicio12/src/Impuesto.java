/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public void mostrar() {
        System.out.println("Impuesto: $" + monto);
        if (contribuyente != null) contribuyente.mostrar();
    }
}
