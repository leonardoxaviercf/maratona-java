package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 13));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));

        lightNovels.stream()
            .filter(ln -> ln.getPrice() > 4)
            .findAny()
            .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 4)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
