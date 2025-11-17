/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1;

/**
 *
 * @author Tadeo
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tadeo");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 8000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        System.out.println("Total del pedido: " + pedido.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDesc = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDesc);

        pedido.setEstado("En preparación");
    }
}

