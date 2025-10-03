/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tadeo
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    
     // Constructor que inicializa nombre y DNI
    public Usuario (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Relaciona un celular al usuario
    public void setCelular (Celular celular) {
        this.celular = celular;        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }
    
    
}
