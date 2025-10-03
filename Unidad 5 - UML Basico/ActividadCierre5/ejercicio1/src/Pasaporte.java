/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Pasaporte {
    // Atributos privados
    private String numero;   // Número único del pasaporte
    private Foto foto;       // Foto asociada al pasaporte (composición)
    private Titular titular; // Titular al que pertenece este pasaporte

    // Constructor: recibe número y URL de la foto
    public Pasaporte(String numero, String urlFoto) {
        this.numero = numero;
        this.foto = new Foto(urlFoto); // Se crea el objeto Foto automáticamente
    }

    // Constructor alternativo: solo recibe número (sin foto)
    public Pasaporte(String numero) {
        this.numero = numero;
    }

    // Asigna un titular al pasaporte (relación bidireccional con Titular)
    public void setTitular(Titular titular) {
        this.titular = titular;

        // Si el titular aún no está asociado a este pasaporte,
        // se corrige la relación llamando a setPasaporte en Titular
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    // Devuelve el número del pasaporte
    public String getNumero() {
        return numero;
    }

    // Devuelve el titular asociado al pasaporte
    public Titular getTitular() {
        return titular;
    }

    // Devuelve la foto asociada al pasaporte
    public Foto getFoto() {
        return foto;
    }

    // Muestra la información del pasaporte en consola
    public void mostrar() {
        System.out.println("Pasaporte: " + numero +
                           " - Foto: " + (foto != null ? foto.getUrl() : "Sin foto"));
    }

}




