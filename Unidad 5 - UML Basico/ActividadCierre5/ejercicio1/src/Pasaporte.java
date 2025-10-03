/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Pasaporte {
        private String numero;
        private Foto foto;
        private Titular titular;

        public Pasaporte(String numero, String urlFoto) {
            this.numero = numero;
            this.foto = new Foto(urlFoto);
        }
        
        public Pasaporte(String numero) {
            this.numero = numero;
        }
        
        public void setTitular(Titular titular) {
            this.titular = titular;
            if (titular != null && titular.getPasaporte() != this) {
                titular.setPasaporte(this);
            }
        }    
        public String getNumero() {
            return numero;
        }
        public Titular getTitular() {
            return titular;
        }

        public Foto getFoto() {
            return foto;
        }

        
        public void mostrar() {
            System.out.println("Pasaporte: " + numero + " - Foto: " +
            foto.getUrl());
    }
}




