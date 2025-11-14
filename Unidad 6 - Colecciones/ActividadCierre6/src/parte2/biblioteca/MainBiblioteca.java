/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.biblioteca;

/**
 *
 * @author sanch
 */
import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Julio Verne", "Francesa");

        // 3. Agregar 5 libros asociados a alguno de los Autores
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El coronel no tiene quien le escriba", 1961, a1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, a2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("ISBN005", "Viaje al centro de la Tierra", 1864, a3);

        // 4. Listar todos los libros con su información y la del autor
        System.out.println("=== LISTAR LIBROS ===");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("=== BUSCAR LIBRO ISBN003 ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico
        System.out.println("=== LIBROS PUBLICADOS EN 1949 ===");
        List<Libro> libros1949 = biblioteca.filtrarLibrosPorAnio(1949);
        for (Libro l : libros1949) {
            l.mostrarInfo();
        }

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("=== ELIMINAR ISBN002 Y LISTAR ===");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("=== AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}

