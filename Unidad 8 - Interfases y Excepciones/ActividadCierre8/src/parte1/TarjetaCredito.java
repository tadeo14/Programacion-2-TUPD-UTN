/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1;

/**
 *
 * @author Tadeo
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // ejemplo: 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }
}

