package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas =  new ArrayList<>(6);

        mangas.add(new Manga(3L,"Naruto", 123));
        mangas.add(new Manga(1L,"DBZ", 234));
        mangas.add(new Manga(4L, "AOT", 542));
        mangas.add(new Manga(2L, "Berserk", 312));

        for (Manga manga : mangas) {
            System.out.println(manga );
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        // Faz a mesma coisa
        mangas.sort(new MangaByIdComparator());

        System.out.println("-------");

        for (Manga manga : mangas) {
            System.out.println(manga );
        }

    }
}
