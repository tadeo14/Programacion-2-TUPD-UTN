/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;
import java.time.LocalDate;

/**
 *
 * @author Tadeo
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate  fechaVencimiento;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
