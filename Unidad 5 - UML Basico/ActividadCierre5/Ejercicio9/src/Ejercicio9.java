/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear paciente y profesional
        Paciente paciente1 = new Paciente("María López", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Ricardo Díaz", "Cardiología");

        // Crear cita médica
        CitaMedica cita1 = new CitaMedica("2025-10-15", "09:30", paciente1, profesional1);

        System.out.println("=== Detalle de la Cita Médica ===");
        cita1.mostrar();
    }
    
}
