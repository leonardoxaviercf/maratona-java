package xavier.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Leonado", "Xavier");
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);

        forEach(nomes, nome -> System.out.println(nome));
        forEach(inteiros, inteiro -> System.out.println(inteiro));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
