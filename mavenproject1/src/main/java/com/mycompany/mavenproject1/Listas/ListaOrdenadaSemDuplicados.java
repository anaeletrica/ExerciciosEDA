package com.mycompany.mavenproject1.Listas;

import java.util.TreeSet;

public class ListaOrdenadaSemDuplicados<T extends Identificavel> {
    private TreeSet<T> elementos = new TreeSet<>((a, b) -> Integer.compare(a.getId(), b.getId()));

    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    public TreeSet<T> getLista() {
        return elementos;
    }
}
