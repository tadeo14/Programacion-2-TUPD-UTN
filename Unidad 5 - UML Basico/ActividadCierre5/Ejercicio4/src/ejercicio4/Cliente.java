/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Tadeo
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetadecredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void TarjetaDeCredito (TarjetaDeCredito tarjetadecredito) {
        this.tarjetadecredito = tarjetadecredito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetadecredito() {
        return tarjetadecredito;
    }
    
    
       
}
