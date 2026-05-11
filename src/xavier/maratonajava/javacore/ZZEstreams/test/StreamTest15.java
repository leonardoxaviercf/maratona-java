package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.Category;
import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import xavier.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
