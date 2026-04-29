package xavier.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> xaviers = new ArrayList<>();
        List<String> graphicDesigners = List.of("Lucas", "Matheus", "Paulo", "Maria");
        List<String> developersJava = List.of("Xavier", "Clara", "Caio", "Ana");
        List<String> students = List.of("Ian", "Kauã");

        xaviers.add(graphicDesigners);
        xaviers.add(developersJava);
        xaviers.add(students);

        // Normalmente faria assim
        for (List<String> people : xaviers) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------------");

        // Usando flatMap
        xaviers.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
