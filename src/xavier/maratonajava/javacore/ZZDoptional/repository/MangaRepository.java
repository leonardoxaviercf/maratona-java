package xavier.maratonajava.javacore.ZZDoptional.repository;

import xavier.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga("DBZ", 432, 0), new Manga("AOT", 92, 1), new Manga("Naruto", 492, 2));

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga m : mangas) {
            if (predicate.test(m)) {
                found = m;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

//    private static Optional<Manga> findByTitle(String title) {
//        Manga found = null;
//        for(Manga m : mangas) {
//            if (m.getTitle().equals(title)) {
//                found = m;
//            }
//        }
//        return Optional.ofNullable(found);
//    }
//
//    private static Optional<Manga> findById (Integer id) {
//        Manga found = null;
//        for (Manga m : mangas) {
//            if (m.getId().equals(id)) {
//                found = m;
//            }
//        }
//        return Optional.ofNullable(found);
//    }
}
