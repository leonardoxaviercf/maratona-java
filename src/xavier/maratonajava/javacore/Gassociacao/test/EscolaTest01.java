package xavier.maratonajava.javacore.Gassociacao.test;

import xavier.maratonajava.javacore.Gassociacao.domain.Escola;
import xavier.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Maria");
        Professor professor2 = new Professor("Pedro");

        Escola escola = new Escola("Escola Mundial", new Professor[] {professor1, professor2});

        escola.imprime();
    }
}
