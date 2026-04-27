package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 titles LightNovels with prive less than 4
public class StreamTest01 {
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
        List<String> lightNovelsByPrice = new ArrayList<>();

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4.00) {
                lightNovelsByPrice.add(lightNovel.getTitle());
            }

            if (lightNovelsByPrice.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(lightNovelsByPrice);
    }
}
