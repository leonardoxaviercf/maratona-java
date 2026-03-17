package xavier.maratonajava.javacore.Gassociacao.test;

import xavier.maratonajava.javacore.Gassociacao.domain.Jogador;
import xavier.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador jogador4 = new Jogador("Vini JR");

        Jogador[] jogadoresTime1 = {jogador1, jogador3};
        Jogador[] jogadoresTime2 = {jogador2, jogador4};

        Time time1 = new Time("Barcelona");
        Time time2 = new Time("Real Madrid");

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time1);
        jogador4.setTime(time2);

        time1.setJogadores(jogadoresTime1);
        time2.setJogadores(jogadoresTime2);

        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();

        System.out.println("--- Times ---");
        time1.imprime();
        time2.imprime();
    }
}
