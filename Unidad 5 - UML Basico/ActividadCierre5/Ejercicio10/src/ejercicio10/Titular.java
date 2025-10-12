/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Tadeo
 */
// Clase Titular: representa al dueño de una cuenta bancaria.
// Está asociada bidireccionalmente con CuentaBancaria.
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // relación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Titular: " + nombre + " - DNI: " + dni);
        if (cuenta != null) {
            System.out.println("Cuenta asociada: " + cuenta.getCbu());
        }
    }
}

