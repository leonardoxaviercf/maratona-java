package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<Manga>();

        mangas.add(new Manga(3L,"Naruto", 123, 0));
        mangas.add(new Manga(1L,"DBZ", 234, 5));
        mangas.add(new Manga(4L, "AOT", 542, 9));
        mangas.add(new Manga(2L, "Berserk", 312, 2));
        mangas.add(new Manga(2L, "Berserk", 312, 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
