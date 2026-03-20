package xavier.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Funcionario - " + "Nome: " + nome + " | Salario: " + salario;
    }
}
