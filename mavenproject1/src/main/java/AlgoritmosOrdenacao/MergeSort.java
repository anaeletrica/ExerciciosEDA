package AlgoritmosOrdenacao;
import java.util.*;

/**
 *
 * @author Ana Carvalho
 */
public class MergeSort {
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        T[] temp = Arrays.copyOf(arr, arr.length);
        
        int i = left, j = mid + 1, k = left;
        
        while (i <= mid && j <= right) {
            if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }

        // Imprimir o passo
        System.out.println("Passo (" + (left + 1) + " - " + (right + 1) + "): " + 
                           Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }
}
