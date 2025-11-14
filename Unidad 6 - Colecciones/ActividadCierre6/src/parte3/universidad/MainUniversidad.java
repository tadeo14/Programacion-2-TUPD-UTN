/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte3.universidad;

/**
 *
 * @author sanch
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("PROF1", "Ana Pérez", "Programación");
        Profesor prof2 = new Profesor("PROF2", "Luis Gómez", "Matemática");
        Profesor prof3 = new Profesor("PROF3", "María López", "Bases de Datos");

        Curso c1 = new Curso("CURS1", "Programación I");
        Curso c2 = new Curso("CURS2", "Programación II");
        Curso c3 = new Curso("CURS3", "Álgebra");
        Curso c4 = new Curso("CURS4", "Cálculo");
        Curso c5 = new Curso("CURS5", "Base de Datos I");

        // 2. Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("CURS1", "PROF1");
        uni.asignarProfesorACurso("CURS2", "PROF1");
        uni.asignarProfesorACurso("CURS3", "PROF2");
        uni.asignarProfesorACurso("CURS4", "PROF2");
        uni.asignarProfesorACurso("CURS5", "PROF3");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("=== LISTA DE CURSOS ===");
        uni.listarCursos();

        System.out.println("=== LISTA DE PROFESORES ===");
        uni.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar
        System.out.println("=== CAMBIAR PROFESOR DE CURS2 A PROF3 ===");
        uni.asignarProfesorACurso("CURS2", "PROF3");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("=== ELIMINAR CURSO CURS3 ===");
        uni.eliminarCurso("CURS3");
        uni.listarCursos();
        uni.listarProfesores();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("=== ELIMINAR PROFESOR PROF1 ===");
        uni.eliminarProfesor("PROF1");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte: cantidad de cursos por profesor.
        uni.reporteCantidadCursosPorProfesor();
    }
}

