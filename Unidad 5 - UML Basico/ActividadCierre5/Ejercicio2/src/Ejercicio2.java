/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Usuario user1 = new Usuario ("Gabriel", "417295534");
        Bateria bate1 = new Bateria("rgtx25", "4000 mAh");
        Celular celu1 = new Celular("552458", "SAMSUNG", "A24", bate1);
        
        // Relacionar el usuario con el celular
        celu1.setUsuario(user1);
        

        //Mostrar la info
        celu1.mostrar();
    }
    
}
