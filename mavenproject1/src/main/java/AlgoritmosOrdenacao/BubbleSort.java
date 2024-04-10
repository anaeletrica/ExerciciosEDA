package AlgoritmosOrdenacao;

/**
 *
 * @author Ana Carvalho
 */
public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        System.out.println("\nArray ordenado usando Bubble Sort:");
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Troca arr[j] e arr[j+1]
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Imprime o passo a passo da ordenação após a iteração completa
            System.out.print("Passo " + (i + 1) + ": ");
            ArrayGenerico.printArray(arr);
            
            // Se não houve trocas nesta iteração, o array está ordenado
            if (!swapped) {
                break;
            }
        }
    }
}
//public class BubbleSort {
//// Bubble Sort genérico
//    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
//        int n = arr.length;
//        boolean swapped;
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j].compareTo(arr[j + 1]) > 0) {
//                    T temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//    }    
//}
