/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author simon
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class Persona{
    private String rut;
    private String nombre;
    private String apellidos;
    private String domicilio;

    public Persona(String rut, String nombre, String apellidos, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }

    public Persona(String rut, String nombre, String apellidos) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}