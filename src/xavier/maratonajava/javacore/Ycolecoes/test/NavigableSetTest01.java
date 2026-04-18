package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Manga;
import xavier.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getMarca().compareTo(s2.getMarca());
    }
}

class MangaComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return Double.compare(m1.getPreco(), m2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
//        NavigableSet<Smartphone> set = new TreeSet<>(new SmaartphoneMarcaComparator());
//        Smartphone smartphone = new Smartphone("123", "Nokia");
//        set.add(smartphone);
//        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<Manga>(new MangaComparator());
        mangas.add(new Manga(3L,"Naruto", 123, 0));
        mangas.add(new Manga(1L,"DBZ", 234, 5));
        mangas.add(new Manga(4L, "AOT", 542, 9));
        mangas.add(new Manga(2L, "Berserk", 312, 2));
        mangas.add(new Manga(2L, "Berserk", 312, 2));

        // Para ordenar de forma decrescente é apenas colocar o .descendingSet()
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        System.out.println("--------------");

        Manga bakugan = new Manga(31L, "Bakugan", 312, 2);

        // Ele compara com os mais próximos a ele, não necessariamente o maior do conjunto de dados
        // lower -> <
        // floor -> <=
        // higher -> >
        // ceiling -> >=

        System.out.println(mangas.lower(bakugan));
        System.out.println(mangas.floor(bakugan));
        System.out.println(mangas.higher(bakugan));
        System.out.println(mangas.ceiling(bakugan));

        // Pega e remove o primeiro ítem do set
        System.out.println(mangas.pollFirst());
        // Pega e remove o último ítem do set
        System.out.println(mangas.pollLast());
    }
}
