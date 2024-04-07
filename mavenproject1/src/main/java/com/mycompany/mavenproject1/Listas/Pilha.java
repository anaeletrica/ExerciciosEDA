/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Listas;

/**
 *
 * @author Ana Carvalho
 */
import java.util.Stack;

public class Pilha<T> {
    private Stack<T> elementos = new Stack<>();

    public void empilhar(T elemento) {
        elementos.push(elemento);
    }

    public T desempilhar() {
        return elementos.pop();
    }
}
