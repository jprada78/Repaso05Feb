package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro {
    String isbn;
    String titulo;

    public Libro(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
    }
    public String darTitulo(){
        return titulo;
    }
}
