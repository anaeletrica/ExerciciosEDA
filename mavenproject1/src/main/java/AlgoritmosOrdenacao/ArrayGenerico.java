package AlgoritmosOrdenacao;

/**
 *
 * @author Ana Carvalho
 */
public class ArrayGenerico {
    // Função para imprimir um array genérico
    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
