package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada<T extends Comparable<T>> {
    // Lista para armazenar os elementos
    private List<T> elementos;

    // Construtor da classe
    public ListaOrdenada() {
        // Inicializa a lista de elementos como uma lista vazia
        this.elementos = new ArrayList<>();
    }

    // Método para adicionar um elemento à lista
    public void adicionar(T elemento) {
        // Adiciona o elemento na lista
        this.elementos.add(elemento);
        // Ordena a lista após adicionar o elemento
        this.ordenar();
    }

    // Método para verificar se a lista está vazia
    public boolean estaVazia() {
        return this.elementos.isEmpty();
    }

    // Método para ordenar os elementos da lista
    private void ordenar() {
        // Utiliza o método sort() da classe Collections para ordenar a lista
        this.elementos.sort(null);
    }

    // Método para imprimir os elementos da lista
    public void imprimir() {
        // Percorre a lista e imprime cada elemento
        for (T elemento : this.elementos) {
            System.out.println(elemento);
        }
    }
}