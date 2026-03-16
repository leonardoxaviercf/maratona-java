package xavier.maratonajava.javacore.Gassociacao.test;

import xavier.maratonajava.javacore.Gassociacao.domain.Jogador;
import xavier.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Ronaldo");

        Time time1 = new Time("Barcelona");

        jogador1.setTime(time1);
        jogador2.setTime(time1);

        jogador1.imprime();
        jogador2.imprime();
    }
}
