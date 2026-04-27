package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 titles LightNovels with prive less than 4
public class StreamTest02 {
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
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() >= 4.00)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
