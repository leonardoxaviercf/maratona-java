package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Xavier";
        funcionario.idade = 21;
//        funcionario.salarios = new double[] {1750.00, 1450.50, 1800.99};

        funcionario.imprimirDados();
    }
}
