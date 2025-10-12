/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
// Clase GeneradorQR: crea objetos de tipo CodigoQR dentro de un método (dependencia de creación)
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // Se crea dentro del método
        System.out.println("QR generado correctamente:");
        qr.mostrar();
    }
}
