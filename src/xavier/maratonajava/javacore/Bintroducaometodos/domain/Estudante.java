package xavier.maratonajava.javacore.Bintroducaometodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimeEstudante(){
        System.out.println("------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("------------");
    }
}
