package xavier.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest03 {
    public static void main(String[] args) {
        List<String> animes = List.of("DBZ", "NRT", "NNT");

        List<Integer> integers = map(animes, String::length);
        List<String> lowers = map(animes, String::toLowerCase);

        System.out.println(integers);
        System.out.println(lowers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }

        return result;
    }
}
