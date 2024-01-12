package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class App9 {

    public static void main(String[] args) {

        // As duas formas de se usar wildcards dentro do Generics:
        // upper bounded = uso do extends, do topo daquele elemento para baixo na hierarquia

        List<? extends Vehicle> l1 = new ArrayList<Vehicle>();
        List<? extends Vehicle> l2 = new ArrayList<Bus>();
        List<? extends Vehicle> l3 = new ArrayList<Car>();

        // lower bounded = uso do super, que é o contrário, daquele elemento até o topo da hierarquia (de Bus até Object)
        //
        List<? super Bus> l4 = new ArrayList<Bus>();
        List<? super Bus> l5 = new ArrayList<Vehicle>();
        List<? super Bus> l6 = new ArrayList<Object>();

        // com o uso do super podemos adicionar elementos, numa lista por exemplo, no máximo do mais baixo da hierarquia
        // ou seja se a lista for de Vehicle ou de Object, no mínimo já tem lá um Bus
        // a desvantagem do super é que ao recuperar o dado sempre vai retornar o tipo do topo (Object), sendo obrigatório o uso de casting
        l4.add(new Bus());
        var e = l4.get(0);
    }
}
