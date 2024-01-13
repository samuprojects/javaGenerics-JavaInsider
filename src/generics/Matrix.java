package generics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Matrix <T> {
    private static final int SIZE = 3;

    // Como explicado em aulas anteriores não usamos um array de objeto T porque após a compilação o generics não aparece no código e logo não existirá um objeto T por isso não compila
    // por isso a utilização de arrays com generics é um pouco mais complicada.
    // Por isso vamos criar uma lista de listas do tipo T
    private final List<List<T>> elements = new ArrayList<>();

    public Matrix() {
        for (int i = 0; i < SIZE; i++) { // criando as linhas
            List<T> row = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) { // criando as colunas com objetos null
                row.add(null);
            }
            elements.add(row);
        }
    }

    public void print() { // imprimindo as linhas e colunas
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(elements.get(i).get(j) + " "); // impressão sem quebra de linha com um espaço entre um e outro elemento
            }
            System.out.println(); // quebra de linha antes de imprimir a próxima linha e colunas
        }
    }

    public void set(int row, int col, T element) { // método recebe a linha, a coluna e o elemento do mesmo tipo da matriz por isso usamos T
        elements.get(row).set(col, element); // get para pegar a linha, set para modificar a coluna e element para alterar o elemento que ali contém
    }
}