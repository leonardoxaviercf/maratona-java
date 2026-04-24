package xavier.maratonajava.javacore.ZZDoptional.test;

import xavier.maratonajava.javacore.ZZDoptional.domain.Manga;
import xavier.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> dbz = MangaRepository.findByTitle("DBZ");
        dbz.ifPresent(m -> m.setTitle("DBZ 2"));
        System.out.println(dbz);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga("Drifters", 53, 3));
        System.out.println(newManga);
    }
}
