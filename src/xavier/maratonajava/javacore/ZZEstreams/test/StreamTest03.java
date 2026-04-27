package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DBZ", 4.99),
            new LightNovel("AOT", 3.99),
            new LightNovel("BOB", 2.99),
            new LightNovel("Young Titans", 7.00),
            new LightNovel("Mary Juana", 12.99),
            new LightNovel("Fullmetal Alchemist", 9.49),
            new LightNovel("IMD - Evil", 1.99)
    ));

    public static void main(String[] args) {
//        lightNovels.stream().forEach(System.out::println); -> Desperdiça processamento
        lightNovels.forEach(System.out::println);
        long count = lightNovels.stream()
                .filter(ln -> ln.getPrice() <= 4.00)
                .count();

        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4.00)
                .count();

        System.out.println(count);
        System.out.println(count2);
    }
}
