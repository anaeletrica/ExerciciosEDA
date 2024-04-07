package com.mycompany.mavenproject1.Listas;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Fila
        System.out.println("Testando a classe Fila:");
        Fila<String> fila = new Fila<>();
        fila.enfileirar("Primeiro elemento");
        fila.enfileirar("Segundo elemento");
        System.out.println("Elemento desenfileirado: " + fila.desenfileirar());

        // Testando a classe ListaNaoOrdenadaComDuplicados
        System.out.println("\nTestando a classe ListaNaoOrdenadaComDuplicados:");
        ListaNaoOrdenadaComDuplicados<Integer> listaComDuplicados = new ListaNaoOrdenadaComDuplicados<>();
        listaComDuplicados.adicionar(10);
        listaComDuplicados.adicionar(20);
        listaComDuplicados.adicionar(10); // Adicionando um elemento duplicado
        System.out.println("Lista com duplicados: " + listaComDuplicados.getLista());

        // Testando a classe ListaNaoOrdenadaSemDuplicados
        System.out.println("\nTestando a classe ListaNaoOrdenadaSemDuplicados:");
        ListaNaoOrdenadaSemDuplicados<String> listaSemDuplicados = new ListaNaoOrdenadaSemDuplicados<>();
        listaSemDuplicados.adicionar("A");
        listaSemDuplicados.adicionar("B");
        listaSemDuplicados.adicionar("A"); // Adicionando um elemento duplicado, que será ignorado
        System.out.println("Lista sem duplicados: " + listaSemDuplicados.getLista());

        // Testando a classe ListaOrdenadaComDuplicados
        System.out.println("\nTestando a classe ListaOrdenadaComDuplicados:");
        ListaOrdenadaComDuplicados<MinhaClasseIdentificavel> listaOrdenadaComDuplicados = new ListaOrdenadaComDuplicados<>();
        listaOrdenadaComDuplicados.adicionar(new MinhaClasseIdentificavel(1));
        listaOrdenadaComDuplicados.adicionar(new MinhaClasseIdentificavel(3));
        listaOrdenadaComDuplicados.adicionar(new MinhaClasseIdentificavel(2));
        listaOrdenadaComDuplicados.adicionar(new MinhaClasseIdentificavel(2)); // Adicionando um elemento duplicado
        System.out.println("Lista Ordenada com Duplicados: " + listaOrdenadaComDuplicados.getLista());

        // Testando a classe ListaOrdenadaSemDuplicados
        System.out.println("\nTestando a classe ListaOrdenadaSemDuplicados:");
        ListaOrdenadaSemDuplicados<MinhaClasseIdentificavel> listaOrdenadaSemDuplicados = new ListaOrdenadaSemDuplicados<>();
        listaOrdenadaSemDuplicados.adicionar(new MinhaClasseIdentificavel(1));
        listaOrdenadaSemDuplicados.adicionar(new MinhaClasseIdentificavel(3));
        listaOrdenadaSemDuplicados.adicionar(new MinhaClasseIdentificavel(2));
        listaOrdenadaSemDuplicados.adicionar(new MinhaClasseIdentificavel(2)); // Adicionando um elemento duplicado, que será ignorado
        System.out.println("Lista Ordenada sem Duplicados: " + listaOrdenadaSemDuplicados.getLista());

        // Testando a classe Pilha
        System.out.println("\nTestando a classe Pilha:");
        Pilha<Double> pilha = new Pilha<>();
        pilha.empilhar(3.14);
        pilha.empilhar(2.71);
        System.out.println("Elemento desempilhado: " + pilha.desempilhar());
    }
}
