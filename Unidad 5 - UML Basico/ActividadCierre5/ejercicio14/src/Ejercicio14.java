/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Video Promocional", 7);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", p1);
    }
    
}
