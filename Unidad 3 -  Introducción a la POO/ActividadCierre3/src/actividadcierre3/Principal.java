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
        
        // Crear dos gallinas
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 0;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;

        // Simular acciones
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar estado
        g1.mostrarEstado();
        g2.mostrarEstado();
        */
       
       // Crear nave
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Apolo";
        nave.combustible = 50;

        // Intentar avanzar sin recargar
        nave.avanzar(15); // debería fallar

        // Recargar
        nave.recargarCombustible(30);

        // Avanzar correctamente
        nave.despegar();
        nave.avanzar(10);

        // Mostrar estado final
        nave.mostrarEstado();
        
        
        
        }
    
}
