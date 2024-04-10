package AlgoritmosOrdenacao;
import java.util.*;
/**
 *
 * @author Ana Carvalho
 */
public class Main {
    // Função main para testar os algoritmos
    public static void main(String[] args) {
        // Teste com Integer
        Integer[] intArr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");
        ArrayGenerico.printArray(intArr);

        // Teste com Selection Sort
        Integer[] selectionSortArr = Arrays.copyOf(intArr, intArr.length);
        SelectionSort.selectionSort(selectionSortArr);
     
        // Teste com Bubble Sort
        Integer[] bubbleSortArr = Arrays.copyOf(intArr, intArr.length);
        BubbleSort.bubbleSort(bubbleSortArr);


        // Teste com Insertion Sort
        Integer[] insertionSortArr = Arrays.copyOf(intArr, intArr.length);
        InsertionSort.insertionSort(insertionSortArr);

//        // Teste com Merge Sort
//        Integer[] mergeSortArr = Arrays.copyOf(intArr, intArr.length);
//        MergeSort.mergeSort(mergeSortArr);
//
//        // Teste com Quick Sort
//        Integer[] quickSortArr = {64, 34, 25, 12, 22, 11, 90};
//        QuickSort.quickSort(quickSortArr, 0, quickSortArr.length - 1);
//        System.out.println("Array ordenado usando Quick Sort:");
//        ArrayGenerico.printArray(quickSortArr);

        // Teste com String
        String[] stringArr = {"banana", "laranja", "maca", "uva", "abacaxi"};
        System.out.println("\nArray original:");
        System.out.println(Arrays.toString(stringArr));
        
        // Teste com Selection Sort
        String[] selectionSortArrs = Arrays.copyOf(stringArr, stringArr.length);
        SelectionSort.selectionSort(selectionSortArrs);
     
        // Teste com Bubble Sort
        String[] bubbleSortArrs = Arrays.copyOf(stringArr, stringArr.length);
        BubbleSort.bubbleSort(bubbleSortArrs);  
        
        // Teste com Insertion Sort
        String[] insertionSortArrs = Arrays.copyOf(stringArr, stringArr.length);
        InsertionSort.insertionSort(insertionSortArrs);
    }
}
