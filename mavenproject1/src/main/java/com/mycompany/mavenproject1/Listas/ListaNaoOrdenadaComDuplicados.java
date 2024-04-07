package com.mycompany.mavenproject1.Listas;

import java.util.HashSet;
import java.util.Set;

public class ListaNaoOrdenadaComDuplicados<T> {
    private Set<T> elementos = new HashSet<>();

    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    public Set<T> getLista() {
        return elementos;
    }
}