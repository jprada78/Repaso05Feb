package org.yourcompany.yourproject;

public class bibliotecario extends usuario{
    private String turno;
    public bibliotecario(String id, String nombre, String email, String turno) {
        super(id, nombre, email);
        this.turno = turno;
    }

    public void darTurno() {
        this.turno = turno;
    }
}
