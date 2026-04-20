package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaComparator().reversed());

        mangas.add(new Manga(3L,"Naruto", 123, 0));
        mangas.add(new Manga(1L,"DBZ", 234, 5));
        mangas.add(new Manga(4L, "AOT", 542, 9));
        mangas.add(new Manga(2L, "Berserk", 312, 2));
        mangas.add(new Manga(2L, "Berserk", 312, 2));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
