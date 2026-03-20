package xavier.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, int salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor - " + "Nome: " + nome + " | Salario: " + salario;
    }
}
