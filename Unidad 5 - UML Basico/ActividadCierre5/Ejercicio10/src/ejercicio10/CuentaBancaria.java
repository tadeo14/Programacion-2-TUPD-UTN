/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Tadeo
 */
// Clase CuentaBancaria: posee una clave de seguridad (composición) 
// y está asociada bidireccionalmente con un titular.
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModif) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModif); // Composición: se crea dentro
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this);
    }

    public String getCbu() {
        return cbu;
    }

    public void mostrar() {
        System.out.println("Cuenta Bancaria - CBU: " + cbu + ", Saldo: $" + saldo);
        if (clave != null) clave.mostrar();
        if (titular != null) System.out.println("Titular: " + titular.getNombre());
    }
}

