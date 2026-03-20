package xavier.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
     protected String nome;
     protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario - " + "Nome: " + nome + " | Salario: " + salario;
    }
}
