/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author jprad
 */
public class Repaso05Feb {

    public static void main(String[] args) {
        bibliotecario bibliotecario= new bibliotecario("78", "Jprada", "jprada", "mañana");
        Socio socio = new Socio("78", "Danigoat", "jpradachavarro", 5);
        System.out.println(bibliotecario.darEmail());
        socio.registrarPrestamo(2);
    }
}

