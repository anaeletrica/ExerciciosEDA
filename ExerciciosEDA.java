package com.mycompany.exercicioseda;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosEDA {

    public static void main(String[] args) {
// Gerar a sequência aleatória de números e salvar em um arquivo
        try {
            File file = new File("numeros.txt");
            FileWriter writer = new FileWriter(file);

            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int numero = random.nextInt(100); // Gera números de 0 a 100
                writer.write(numero + "\n");
            }

            writer.close();
            System.out.println("Sequência de números aleatórios gerada e salva em 'numeros.txt'.");
        } catch (IOException e) {
            System.out.println("Erro na escrita do arquivo .txt.");
            e.printStackTrace();
        }

        // Ler o arquivo e produzir o histograma com a frequência relativa
        try {
            File file = new File("numeros.txt");
            Scanner scanner = new Scanner(file);

            int[] frequencia = new int[101]; 

            while (scanner.hasNextLine()) {
                int numero = Integer.parseInt(scanner.nextLine());
                frequencia[numero]++;
            }

            System.out.println("Histograma com frequência relativa:");
            for (int i = 0; i < frequencia.length; i++) {
                if (frequencia[i] > 0) {
                    double frequenciaRelativa = (double) frequencia[i] / 100;
                    System.out.println(i + ": " + frequenciaRelativa);
                }
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo .txt.");
            e.printStackTrace();
        }
    }
}