package xavier.maratonajava.javacore.ZZBcomportamento.test;

import xavier.maratonajava.javacore.ZZBcomportamento.domain.Car;
import xavier.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("Red", 2018), new Car("Blue", 2020), new Car("Green", 2012)));

    public static void main(String[] args) {
        // Utilizando Lambda
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> oldCars = filter(cars, car -> car.getYear() < 2019);

        System.out.println(greenCars);
        System.out.println(oldCars);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T obj : list) {
            if (predicate.test(obj)) {
                filteredList.add(obj);
            }
        }
        return filteredList;
    }
}
