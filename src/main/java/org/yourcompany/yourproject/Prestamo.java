package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Prestamo {
    private Socio socio;
    private ArrayList<Ejemplar> ejemplar= new ArrayList<>();

    public void pedirPrestamo(Socio socio, Ejemplar ejemplar1){
        this.ejemplar.add(ejemplar1);
        this.socio = socio;


    }
    public void notificarCreacion(Notificador notificador){
        notificador.enviar(socio.email, "Se le notifica su préstamo");

    }
}
