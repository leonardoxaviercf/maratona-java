package xavier.maratonajava.javacore.Dconstrutores.test;


import xavier.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "Mangá", 275, "Ação"); // Segundo construtos
        Anime anime2 = new Anime(); // Primeiro construtor
        Anime anime3 = new Anime("Naruto", "Mangá", 145, "Ação", "Gibli"); // Terceiro construtor

        anime.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
