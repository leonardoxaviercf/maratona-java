package xavier.maratonajava.javacore.ZZClambdas.test;

import xavier.maratonajava.javacore.ZZClambdas.domain.Anime;
import xavier.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("DBZ", 283), new Anime("Naruto", 412), new Anime("NNTS", 107)));

//        Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//         Collections.sort(animes, (a1, a2) -> AnimeComparators.compareByTittle(a1, a2));

        // Melhor sintaxe
        animes.sort(AnimeComparators::compareByTittle);
        System.out.println(animes);

        animes.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animes);
    }
}
