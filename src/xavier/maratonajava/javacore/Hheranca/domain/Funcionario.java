package xavier.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public void  imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu "+this.nome+ " recebi o salário de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
