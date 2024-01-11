package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class App5 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);

        driveVehicles(vehicles);
    }

    // regra do Generics: não é possível atribuir elementos que não são do mesmo tipo
    // por isso não podemos atribuir uma lista de Car como parâmetro para o método driveVehicles
    // assim como não é possível atribuir uma lista de Bus, somente de Vehicle
    // apesar de Car e Bus herdarem de Vehicle como o tipo parametrizado é Vehicle o compilador não permite a execução do código
    private static void driveVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}
