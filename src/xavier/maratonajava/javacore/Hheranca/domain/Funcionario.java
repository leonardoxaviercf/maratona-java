package xavier.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public void  imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
