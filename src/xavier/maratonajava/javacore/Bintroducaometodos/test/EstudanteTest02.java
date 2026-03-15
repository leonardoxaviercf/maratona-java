package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01  = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sherlock";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Capitão";
        estudante02.idade = 8;
        estudante02.sexo = 'M';

        estudante01.imprimeEstudante();
        estudante02.imprimeEstudante();
    }
}
