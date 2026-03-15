package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Xavier");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[] {1750.00, 1400.00, 1380.00});

        funcionario.imprimirDados();

        System.out.println(funcionario.getMedia());
    }
}
