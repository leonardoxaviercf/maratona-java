package xavier.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario * 1.1;
    }

//    @Override
//    public void imprimir() {
//        System.out.println("Nome: " + this.nome);
//        System.out.println("Salario: " + this.salario);
//    }

    @Override
    public String toString() {
        return "Funcionario - " + "Nome: " + nome + " | Salario: " + salario;
    }
}
