package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.Category;
import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import xavier.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DBZ", 4.99, Category.FANTASY),
            new LightNovel("AOT", 3.99, Category.FANTASY),
            new LightNovel("BOB", 2.99, Category.ROMANCE),
            new LightNovel("Young Titans", 7.00, Category.DRAMA),
            new LightNovel("Mary Juana", 12.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 9.49,  Category.DRAMA),
            new LightNovel("IMD - Evil", 1.99, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);
    }
}
