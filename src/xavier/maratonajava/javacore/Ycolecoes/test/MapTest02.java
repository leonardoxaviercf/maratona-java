package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Leonardo");
        Consumidor c2 = new Consumidor("Xavier");

        Manga manga1 = new Manga(3L, "Naruto", 123);
        Manga manga2 = new Manga(1L,"DBZ", 234);
        Manga manga3 = new Manga(4L, "AOT", 542);
        Manga manga4 = new Manga(2L, "Berserk", 312);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, manga1);
        consumidorManga.put(c2, manga2);

        for (Map.Entry<Consumidor, Manga> entry :  consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
