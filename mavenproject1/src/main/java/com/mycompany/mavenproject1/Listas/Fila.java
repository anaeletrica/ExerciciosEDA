/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Listas;

/**
 *
 * @author Ana Carvalho
 */
import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {
    private Queue<T> elementos = new LinkedList<>();

    public void enfileirar(T elemento) {
        elementos.add(elemento);
    }

    public T desenfileirar() {
        return elementos.poll();
    }
}

