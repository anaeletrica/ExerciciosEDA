/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Listas;

/**
 *
 * @author Ana Carvalho
 */
import java.util.HashSet;
import java.util.Set;

public class ListaNaoOrdenadaSemDuplicados<T> {
    private Set<T> elementos = new HashSet<>();

    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    public Set<T> getLista() {
        return elementos;
    }
}
