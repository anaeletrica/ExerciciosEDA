import java.util.ArrayDeque;
import java.util.Deque;

public class MinhaDeque<T> {
    private Deque<T> elementos = new ArrayDeque<>();

    public void adicionarInicio(T elemento) {
        elementos.addFirst(elemento);
    }

    public void adicionarFim(T elemento) {
        elementos.addLast(elemento);
    }

    public T removerInicio() {
        return elementos.pollFirst();
    }

    public T removerFim() {
        return elementos.pollLast();
    }
}
