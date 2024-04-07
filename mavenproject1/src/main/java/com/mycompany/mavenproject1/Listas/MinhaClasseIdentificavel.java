package com.mycompany.mavenproject1.Listas;

public class MinhaClasseIdentificavel implements Identificavel {
    private int id;

    public MinhaClasseIdentificavel(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
