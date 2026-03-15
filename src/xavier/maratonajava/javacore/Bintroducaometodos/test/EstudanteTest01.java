package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import xavier.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Xavier";
        estudante1.idade = 21;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressora.imprimeEstudante(estudante1);
        impressora.imprimeEstudante(estudante2);

        System.out.println("------------");
        System.out.println("Nome 1: " + estudante1.nome);
        System.out.println("Nome 2: " + estudante2.nome);
    }
}
