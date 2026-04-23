package xavier.maratonajava.javacore.ZZBcomportamento.test;

import xavier.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("Red", 2018), new Car("Blue", 2020), new Car("Green", 2012)));

    public static void main(String[] args) {
//        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(FilterCarByYearBefore(cars, 2019));
    }

    // Não escalável para filtros de outras cores
    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> listCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                listCars.add(car);
            }
        }
        return listCars;
    }

    private static List<Car> FilterCarByYearBefore(List<Car> cars, int year) {
        List<Car> listCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                listCars.add(car);
            }
        }
        return listCars;
    }
}
