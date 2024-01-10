package generics;

public class App4 {
    public static void main(String[] args) {
        Buffer<Integer> b = new Buffer<>();
        b.add(10);
        b.add(20);

        // Buffer é do tipo T, Integer, mas ao utilizar o transform mudamos para tipo K, nesse caso uma String
        Buffer<String> b2 = b.transform(e -> "_" + e + "_");
        System.out.println(b2.remove().orElseThrow());
        System.out.println(b2.remove().orElseThrow());

        // toda vez que é definido um tipo parametrizado na classe, como o T, toda classe enxerga ele podendo utilizar em atributos, construtores e métodos
        // já quando um tipo parametrizado é definido em um método, como o K, só pode ser utilizado no método.
    }
}
