package xavier.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Aluno {
    private String nome;
    private int idade;
    private String seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, String seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprimir() {
        System.out.println("---------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (seminario != null) {
            System.out.println("Seminario: " + seminario);
        }
        System.out.println("---------------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public String getSeminario() {
        return this.seminario;
    }

}
