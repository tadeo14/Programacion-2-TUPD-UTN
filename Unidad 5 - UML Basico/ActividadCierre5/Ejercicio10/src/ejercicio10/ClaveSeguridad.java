/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Tadeo
 */
// Clase ClaveSeguridad: forma parte de una composición con CuentaBancaria
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public void mostrar() {
        System.out.println("Clave de Seguridad - Código: " + codigo + ", Última modificación: " + ultimaModificacion);
    }
}

