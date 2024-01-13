package generics;

public class ExMatrix {

    // Implementar uma classe Matrix para representar uma matriz tamanho 3 x 3
    // Os tipos de dados dos elementos devem ser parametrizados com generics
    // Implementar os métodos a seguir para interagir com a matriz
    // print(): para imprimir os elementos na tela
    // set(): para definir o valor em uma linha e coluna específica da matriz

    public static void main(String[] args) {
        Matrix<Integer> m1 = new Matrix<>();
        m1.set(0, 0, 1); // set automaticamente recebe parâmetros do tipo definido no generics, nesse caso Integer
        m1.set(1, 1, 5); // como no construtor da matriz definimos tudo como null na impressão veremos o número 1 na posição de linha 0 coluna 0
        m1.print(); // e o número 5 na posição da linha 1 coluna 1, permanecendo o restante como null do construtor

    }
}
