/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte3.universidad;

/**
 *
 * @author sanch
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        // Si no hay cambio, no hacemos nada
        if (this.profesor == p) {
            return;
        }

        // Quitar de la lista del profesor anterior
        if (this.profesor != null) {
            this.profesor.eliminarCursoInterno(this);
        }

        // Asignar nuevo profesor
        this.profesor = p;

        // Agregar a la lista del nuevo profesor
        if (p != null) {
            p.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre);
        System.out.println("  Código: " + codigo);
        if (profesor != null) {
            System.out.println("  Profesor: " + profesor.getNombre());
        } else {
            System.out.println("  Profesor: [sin asignar]");
        }
        System.out.println("---------------------------------------");
    }
}

