package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas =  new ArrayList<>(6);

        mangas.add(new Manga(3L,"Naruto", 123));
        mangas.add(new Manga(1L,"DBZ", 234));
        mangas.add(new Manga(4L, "AOT", 542));
        mangas.add(new Manga(2L, "Berserk", 312));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga );
        }

        Manga mangaSearch = new  Manga(1L,"DBZ", 234);

        System.out.println(Collections.binarySearch(mangas, mangaSearch));
    }
}
