package generics;

import java.util.LinkedList;
import java.util.Optional;

public class Buffer<T> {

    /*
    * Um Buffer representa um conjunto de dados que estão organizados em uma fila (os primeiros que entram são os primeiros a saírem, buffer ordenado).
    *
     */

    private final LinkedList<T> elements = new LinkedList<>();

    public void add(T element) {
        elements.addLast(element);
    }

    public Optional<T> remove() {
        if (elements.isEmpty()){
            return Optional.empty(); // usando um Optional eliminamos problemas com Exceções
        }
        return Optional.of(elements.removeFirst());
    }
}
