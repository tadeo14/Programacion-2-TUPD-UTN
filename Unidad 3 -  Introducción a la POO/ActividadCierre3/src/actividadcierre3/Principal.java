/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadcierre3;

/**
 *
 * @author Tadeo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Estudiante Carlos = new Estudiante();
        
        Carlos.nombre = "Carlos";
        Carlos.apellido = "Aranda";
        Carlos.curso = "5A";
        Carlos.calificacion = 4;
        
        Carlos.mostrarInfo();
        Carlos.bajarCalificacion();
        Carlos.subirCalificacion();      
        
        Mascotas Oliva = new Mascotas();
        
        Oliva.nombre = "Oliva";
        Oliva.especie = "Perro";
        Oliva.edad = 5;
        
        Oliva.mostrarInfo();
        Oliva.cumplirAnios();
        */
         // Crear un libro
        Libro libro1 = new Libro();
        
        // Usamos setters para asignar valores
        libro1.setTitulo("Cien Años de Soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.añoPublicacion(1967);
        
        
        // Intentar modificar el año con un valor inválido
        libro1.añoPublicacion(-50); // inválido

        // Intentar modificar el año con un valor válido
        libro1.añoPublicacion(1985); // válido

        // Mostrar información final
        libro1.mostrarInfo();
        
        }
    
}
