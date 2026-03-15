package xavier.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios != null){
            for (int i = 0; i < salarios.length; i++) {
                System.out.println("Salario " + (i+1) + ": " + salarios[i]);
            }

            mediaDosSalarios();
        }

    }

    public void mediaDosSalarios(){
        if (salarios == null){
            return;
        }

        double soma = 0;
        for(double salarioDoMes : this.salarios){
            soma += salarioDoMes;
        }

        this.media = soma / this.salarios.length;

        System.out.println("Média dos salários: " + this.media);
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Por questões de segurança de código, o setMedia não existe, pois a média poderia ser alterada
    // e manipulada dentro do código, não resultando na média real

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
