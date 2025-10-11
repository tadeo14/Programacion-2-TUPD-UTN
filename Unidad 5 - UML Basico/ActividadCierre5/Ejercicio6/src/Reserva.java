/*
 * Clase Reserva
 * Representa una reserva realizada por un cliente, con fecha y hora.
 */

import java.time.LocalDate;  // Para manejar fechas (sin hora)
import java.time.LocalTime;  // Para manejar horas (sin fecha)

/**
 * @author Tadeo
 * * - Agregación: Reserva → Mesa
 * * - Asociación unidireccional: Reserva → Cliente
 */
public class Reserva {

    // Atributos de la clase
    private LocalDate fecha;   // Fecha de la reserva
    private LocalTime hora;    // Hora de la reserva
    private Cliente cliente;   // Asociación unidireccional: Reserva → Cliente
    private Mesa mesa;       // Agregación

    // Constructor
    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }


    /**
     * Setter para asignar un cliente a la reserva.
     * 
     * @param cliente Objeto de tipo Cliente asociado a la reserva
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

     // Mostrar información completa de la reserva
    public void mostrar() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);

        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + " - Tel: " + cliente.getTelefono());
        } else {
            System.out.println("Cliente: (no asignado)");
        }

        if (mesa != null) {
            System.out.println("Mesa Nº: " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")");
        } else {
            System.out.println("Mesa: (no asignada)");
        }
    }
}

