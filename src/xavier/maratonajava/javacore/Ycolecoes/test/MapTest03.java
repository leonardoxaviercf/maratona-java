package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Leonardo");
        Consumidor c2 = new Consumidor("Xavier");

        Manga manga1 = new Manga(3L, "Naruto", 123);
        Manga manga2 = new Manga(1L,"DBZ", 234);
        Manga manga3 = new Manga(4L, "AOT", 542);
        Manga manga4 = new Manga(2L, "Berserk", 312);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, mangaConsumidor1List);
        consumidorMangaMap.put(c2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + " - ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNome() + " - ");
            }
            System.out.println();
        }
    }
}
