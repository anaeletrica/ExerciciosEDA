//package Teste.teste;
//
///**
// *
// * @author Ana Carvalho
// */
//public class Car {
// 
//    // Atributos
//    private String marca;
//    private String modelo;
//    private int ano;
//    private boolean ligado;
//    
//    // Construtor
//    public Carro(String marca, String modelo, int ano) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.ano = ano;
//        this.ligado = false; // Por padrão, o carro inicia desligado
//    }
//    
//    // Método para ligar o carro
//    public void ligar() {
//        if (!ligado) {
//            ligado = true;
//            System.out.println("O carro está ligado.");
//        } else {
//            System.out.println("O carro já está ligado.");
//        }
//    }
//    
//    // Método para desligar o carro
//    public void desligar() {
//        if (ligado) {
//            ligado = false;
//            System.out.println("O carro está desligado.");
//        } else {
//            System.out.println("O carro já está desligado.");
//        }
//    }
//    
//    // Método para verificar se o carro está ligado
//    public boolean estaLigado() {
//        return ligado;
//    }
//    
//    // Método para obter informações do carro
//    public void getInfo() {
//        System.out.println("Marca: " + marca);
//        System.out.println("Modelo: " + modelo);
//        System.out.println("Ano: " + ano);
//        System.out.println("Status: " + (ligado ? "ligado" : "desligado"));
//    }
//    
//    public static void main(String[] args) {
//        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
//        meuCarro.getInfo(); // Mostra as informações do carro recém-criado
//        meuCarro.ligar(); // Liga o carro
//        meuCarro.ligar(); // Tenta ligar o carro novamente
//        meuCarro.desligar(); // Desliga o carro
//    }
//}
//
//}
