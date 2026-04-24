package xavier.maratonajava.javacore.ZZClambdas.test;

import xavier.maratonajava.javacore.ZZClambdas.domain.Anime;
import xavier.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
//        AnimeComparators animeComparators = new AnimeComparators();
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animes = new ArrayList<>(List.of(new Anime("DBZ", 283), new Anime("Naruto", 412), new Anime("NNTS", 107)));

        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);

        BiFunction<String, Integer, Anime> animeBiFunction = (tittle, episodes) -> new Anime(tittle, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction2.apply("AOT", 70));
    }
}
