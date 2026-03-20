package xavier.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, int salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario * 1.05;
    }

//    @Override
//    public void imprimir() {
//        System.out.println("Nome: " + this.nome);
//        System.out.println("Salario: " + this.salario);
//    }

    @Override
    public String toString() {
        return "Desenvolvedor - " + "Nome: " + nome + " | Salario: " + salario;
    }
}
