package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas =  new ArrayList<>(6);

        mangas.add(new Manga(3L,"Naruto", 123, 0));
        mangas.add(new Manga(1L,"DBZ", 234, 5));
        mangas.add(new Manga(4L, "AOT", 542, 9));
        mangas.add(new Manga(2L, "Berserk", 312, 2));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//        if (manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
