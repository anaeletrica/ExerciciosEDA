package AlgoritmosOrdenacao;

/**
 *
 * @author Ana Carvalho
 */
public class InsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        System.out.println("\nArray ordenado usando Insertion Sort:");
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;

            // Move os elementos do arr[0..i-1] que são maiores que a chave
            // para uma posição à frente de suas posições atuais
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Imprime o passo a passo da ordenação após a iteração i
            System.out.print("Passo " + i + ": ");
            ArrayGenerico.printArray(arr);
        }
    }
}
