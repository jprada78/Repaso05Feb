package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro {
    String isbn;
    String titulo;
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
    }
    public void crearEjemplar(String codigo){

        ejemplares.add(new Ejemplar(codigo, this));

    }
    public String darTitulo(){
        return titulo;
    }
}
