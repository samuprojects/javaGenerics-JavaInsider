package generics;

import generics.Vehicle.Bus;
import generics.Vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class App6 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();

        List<Vehicle> vehicles = new ArrayList<>(); // podemos passar no array normalmente Vehicles do tipo Car e Bus
        vehicles.add(bus);
        vehicles.add(car);
        driveVehicles(vehicles); // porém, se a lista parametrizada for <Vehicle> somente Vehicles

        List<Bus> buses = new ArrayList<>();
        buses.add(bus);
        driveVehicles(buses); // mesmo que se tenha uma lista exclusiva de Bus se o método parametrizada for <Vehicle> somente uma lista de Vehicles
        // Exceto com wildcard que pode vai permitir qualquer tipo de lista que herde de Vehicle e o próprio Vehicle.
        // A lista de Vehicle pode usar wildcard diretamente de forma que o ArrayList também poderia receber qualquer tipo de elemento que herde de Vehicle e o próprio Vehicle.


        // OBSERVAÇÃO: NO USO DOS WILDCARDS MANTÉM NOMENCLATURA EXTENDS MESMO NA PRESENÇA DE INTERFACES, NÃO EXISTE IMPLEMENTS DENTRO DA SINTAXE DO WILDCARD DO GENERICS
    }

    // uma forma de contornar isso é utilizando os wildcards
    // é representado por um ponto de interrogação e define os limites de tipos de dados que podem conter determinado generics
    // com isso ao invés de passar como parâmetro apenas uma lista de Vehicles podemos passar uma lista de tudo que estende Vehicle conforme a seguir
    private static void driveVehicles(List<? extends Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}
