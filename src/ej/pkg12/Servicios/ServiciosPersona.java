/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg12.Servicios;

import ej.pkg12.Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Guairo
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona p1) {
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());

        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año");
        int anio = leer.nextInt();

        Date FechaDeNac = new Date(anio - 1900, mes - 1, dia);

        p1.setFechanac(FechaDeNac);

    }

    public void calcularEdad(Persona p1) {

        Date ahora = new Date();

        int difanio = ahora.getYear() - (p1.getFechanac().getYear());
        int difmes = ahora.getMonth() - (p1.getFechanac().getMonth());
        int difdia = ahora.getDate() - (p1.getFechanac().getDate());

        // Si está en ese año pero todavía no los ha cumplido
        if (difmes < 0 || (difmes == 0 && difdia < 0)) {
            difanio = difanio - 1;
        }
        System.out.println("la persona tiene: " + difanio + " años");
        p1.setEdad(difanio);
    }

    public boolean menorQue(int edadcomp, Persona p1) {
        return p1.getEdad() < edadcomp;

    }

    public void mostrarPersona(Persona p1) {

        System.out.println(p1.toString());
    }
}
