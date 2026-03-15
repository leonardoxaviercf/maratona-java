package xavier.maratonajava.javacore.Csobrecargametodos.test;

import xavier.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.init("Naruto", "Mangá", 345);
        anime.setGenero("Ação");

        anime2.init("Dragon Ball Z", "Mangá", 275, "Ação");




//        anime.setNome("Naruto");
//        anime.setTipo("Mangá");
//        anime.setEpsodios(345);

        anime.imprime();
        anime2.imprime();
    }
}
