package xavier.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

        double media = soma / this.salarios.length;

        System.out.println("Média dos salários: " + media);
    }
}
