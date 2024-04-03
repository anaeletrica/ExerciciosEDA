package com.mycompany.mavenproject1;

public class Exercicio2 {

    public static void main(String[] args) {
        // Cria uma nova lista ordenada de números inteiros
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();

        // Adiciona alguns números à lista
        lista.adicionar(5);
        lista.adicionar(3);
        lista.adicionar(7);

        // Imprime os elementos da lista
        lista.imprimir();
    }
}

