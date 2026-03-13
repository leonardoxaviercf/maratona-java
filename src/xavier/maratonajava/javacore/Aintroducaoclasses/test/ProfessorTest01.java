package xavier.maratonajava.javacore.Aintroducaoclasses.test;

import xavier.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Leonardo";
        professor.idade = 21;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " | Idade: " + professor.idade + " | Sexo: " + professor.sexo);
    }
}
