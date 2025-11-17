/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1;

/**
 *
 * @author Tadeo
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) { productos.add(p); }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.getPrecio();
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) cliente.notificar("El pedido cambió a: " + nuevoEstado);
    }

    public String getEstado() { return estado; }
}

