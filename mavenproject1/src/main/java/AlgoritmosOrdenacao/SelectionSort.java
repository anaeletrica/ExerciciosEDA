package AlgoritmosOrdenacao;
import java.util.*;
/**
 *
 * @author Ana Carvalho
 */
public class SelectionSort {
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        System.out.println("\nArray ordenado usando Selection Sort:");
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Troca o elemento mínimo encontrado com o elemento na posição i
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Imprime o passo a passo da ordenação após a troca
            System.out.print("Passo " + (i + 1) + ": ");
            ArrayGenerico.printArray(arr); // Chamando a função printArray da classe ArrayGenerico
        }
    }
}
//public class SelectionSort {
//    // Selection Sort genérico
//    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j].compareTo(arr[minIndex]) < 0) {
//                    minIndex = j;
//                }
//            }
//
//            T temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//    }
//    
//}
