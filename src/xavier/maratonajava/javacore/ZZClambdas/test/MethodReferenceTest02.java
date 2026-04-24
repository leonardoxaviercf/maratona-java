package xavier.maratonajava.javacore.ZZClambdas.test;

import xavier.maratonajava.javacore.ZZClambdas.domain.Anime;
import xavier.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("DBZ", 283), new Anime("Naruto", 412), new Anime("NNTS", 107)));

//        animes.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        animes.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animes);
    }
}
