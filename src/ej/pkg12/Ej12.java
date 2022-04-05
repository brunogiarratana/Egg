/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg12;

import ej.pkg12.Entidades.Persona;
import ej.pkg12.Servicios.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author Guairo
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = new Persona();
        sp.crearPersona(p1);
        sp.calcularEdad(p1);
        System.out.println("");
        System.out.println("Ingrese edad para comparar");
        int edadcomp = leer.nextInt();
        System.out.println("");
        System.out.println("retorna true en caso de que p1 tenga menor edad edadcomp");
        System.out.println(sp.menorQue(edadcomp, p1));
        System.out.println("");
        sp.mostrarPersona(p1);
    }

}
