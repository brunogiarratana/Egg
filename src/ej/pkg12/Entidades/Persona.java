/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg12.Entidades;

import java.util.Date;

/**
 *
 * @author Guairo
 */
public class Persona {
    private String nombre;
    private Date fechanac;
    private int edad;

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, Date fechanac) {
        this.nombre = nombre;
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechanac=" + fechanac + ", edad=" + edad + '}';
    }


    
}
