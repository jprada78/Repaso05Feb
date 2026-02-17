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
        Biblioteca biblioteca = new Biblioteca();

        Bibliotecario bibliotecario= new Bibliotecario("78", "Jprada", "jpradachavarro@gmail.com", "mañana");
        biblioteca.agregarBibliotecario(bibliotecario);

        Socio socio = new Socio("22", "Danigoat", "danigoat@gmail.com", 5);
        biblioteca.agregarSocio(socio);
        System.out.println(biblioteca.darSocios().get(0).darNombre());
        System.out.println(bibliotecario.darEmail());
        socio.registrarPrestamo(2);

        Notificador email = new EmailNotificador();
        Notificador sms = new SmsNotificador();

        email.enviar("usuario@correo.com", "Tu prestamo fue creado.");
        sms.enviar("3001234567", "Tu prestamo fue aprobado.");
    }

}

