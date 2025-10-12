/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Tadeo
 */
// Tiene una AGREGACIÓN con Usuario.
public class FirmaDigital {
    private String codigoHash;  // Identificador único de la firma
    private String fecha;       // Fecha de firma
    private Usuario usuario;    // Agregación: la firma conoce al usuario

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public void mostrar() {
        System.out.println("Firma digital - Código: " + codigoHash + " - Fecha: " + fecha);
        if (usuario != null) {
            usuario.mostrar();
        }
    }
}
