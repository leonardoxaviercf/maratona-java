package xavier.maratonajava.javacore.Gassociacao.exercicio.test;

import xavier.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo", 21, "Impactos da IA");
        Aluno aluno2 = new Aluno("Gabriel", 30, "Analise de requisitos");

        aluno1.imprimir();
        aluno2.imprimir();
    }
}
