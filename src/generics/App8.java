package generics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class App8 {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");

        List<? extends Object> l2 = new ArrayList<String>(); // O código compila, mas não permite adição de novos elementos
        //l2.add("a");
        //l2.add("b");

        List<?> l3 = new ArrayList<String>(); // na prática a utilização do Generics somente com "?" (wildcard) é o mesmo que utilizar <? extends Object>
        // porque tudo herda de Object
    }
}
