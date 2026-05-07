package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.Category;
import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.DRAMA, drama);

        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
