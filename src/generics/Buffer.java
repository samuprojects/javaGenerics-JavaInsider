package generics;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

public class Buffer<T> {

    /*
    * Um Buffer representa um conjunto de dados que estão organizados em uma fila (os primeiros que entram são os primeiros a saírem, buffer ordenado).
    *
     */

    private final LinkedList<T> elements;

    public Buffer(){ // incluindo construtor para as alterações implementadas com o método transform
        this(new LinkedList<>());
    }

    private Buffer(LinkedList<T> elements) { // construtor que será usado no método transform
        this.elements = elements;
    }

    public void add(T element) {
        elements.addLast(element);
    }

    public Optional<T> remove() {
        if (elements.isEmpty()){
            return Optional.empty(); // usando um Optional eliminamos problemas com Exceções
        }
        return Optional.of(elements.removeFirst());
    }

    // colocando o tipo parametrizado antes informamos ao java que ele pode ser usado por esse método para executar sua operação e assim não mexemos no generics da classe
    public <K> Buffer <K> transform(Function<T, K> function) { // k não existe fora do contexto do método
        return new Buffer<>(new LinkedList<>(elements.stream().map(function).toList())); // método recebe uma função, pega tudo que é T e transforma em K (pode ser qualquer coisa)
    }
}
