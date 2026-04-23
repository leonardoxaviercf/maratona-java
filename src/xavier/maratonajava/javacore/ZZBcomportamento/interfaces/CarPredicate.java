package xavier.maratonajava.javacore.ZZBcomportamento.interfaces;

import xavier.maratonajava.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
