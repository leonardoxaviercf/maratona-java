package xavier.maratonajava.javacore.Gassociacao.exercicio.test;

import xavier.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import xavier.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import xavier.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo", 21);
        Aluno aluno2 = new Aluno("Gabriel", 18);
        Aluno aluno3 = new Aluno("Lucas", 19);
        Aluno aluno4 = new Aluno("Clara", 22);
        Aluno aluno5 = new Aluno("José", 27);
        Aluno aluno6 = new Aluno("Felix", 24);

        Professor professor1 = new Professor("Maria", "Algorítmos");
        Professor professor2 = new Professor("Xavier", "Análise de dados");

        Seminario seminario1 = new Seminario("Algoritmos de busca", "Sala B206");
        Seminario seminario2 = new Seminario("Ética e dados", "A304");
        Seminario seminario3 = new Seminario("Ciência de dados", "B205");

        Aluno[] alunos1 = {aluno1, aluno4};
        Aluno[] alunos2 = {aluno2, aluno3};
        Aluno[] alunos3 = {aluno5, aluno6};

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);
        seminario3.setAlunos(alunos3);

        Seminario[] seminarios1 = {seminario1};
        Seminario[] seminarios2 = {seminario2, seminario3};

        professor1.setSeminarios(seminarios1);
        professor2.setSeminarios(seminarios2);

        seminario1.setProfessor(professor1);
        seminario2.setProfessor(professor2);
        seminario3.setProfessor(professor2);

        aluno1.setSeminario(seminario1);
        aluno4.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario2);
        aluno5.setSeminario(seminario3);
        aluno6.setSeminario(seminario3);



        seminario1.imprimir();
        seminario2.imprimir();
        seminario3.imprimir();

        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        aluno4.imprimir();
        aluno5.imprimir();
        aluno6.imprimir();

        professor1.imprimir();
        professor2.imprimir();
     }
}
