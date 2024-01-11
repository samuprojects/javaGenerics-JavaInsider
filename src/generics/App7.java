package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class App7 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bus);
        vehicles.add(car);

        List<? extends Vehicle> cars = new ArrayList<Car>();
        //cars.add(car); // NÃO COMPILA

        // REGRA: APESAR DE PODER USAR O WILDCARD NA LISTA, PERMITINDO REMOVER ELEMENTOS, ITERAR SOBRE ELES, ETC,  NÃO PODEMOS ADICIONAR ELEMENTOS
        // ISSO OCORRE PORQUE O GENERICS FOI CRIADO JUSTAMENTE PARA PREVENIR QUE DADOS ERRADOS SEJAM INSERIDOS E IDENTIFICADOS EM TEMPO DE "COMPILAÇÃO"
    }
}
