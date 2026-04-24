package xavier.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.ofNullable("Au au");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("------------");

//        Optional<String> nameOptional = Optional.ofNullable(findName("Leonardo"));
        Optional<String> nameOptional = findName("Leonardo");
        String empty = nameOptional.orElse("EMPTY");

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

        System.out.println(empty);
    }

    private static Optional<String> findName(String name) {
        List<String> names = List.of("Leonardo", "Xavier", "Maria");
        int index = names.indexOf(name);
        if (index >= 0) {
            return Optional.of(names.get(index));
        }
        return Optional.empty();
    }
}
