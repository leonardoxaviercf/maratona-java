package xavier.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of am arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Leonardo", "Maria", "Clara"));

        names.sort(String::compareTo);
        System.out.println(names);
        Function<String,Integer> numStringToInteger = Integer::parseInt;

        Integer num = numStringToInteger.apply("10");
        System.out.println(num + 40);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Leonardo"));
    }
}
