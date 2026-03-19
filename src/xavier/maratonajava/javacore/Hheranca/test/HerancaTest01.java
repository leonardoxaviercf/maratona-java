package xavier.maratonajava.javacore.Hheranca.test;


import xavier.maratonajava.javacore.Hheranca.domain.Endereco;
import xavier.maratonajava.javacore.Hheranca.domain.Funcionario;
import xavier.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da Alfeneiros");
        endereco.setCep("12345-678");

        Pessoa pessoa =  new Pessoa();
        pessoa.setNome("Leonardo");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Xavier");
        funcionario.setCpf("234.567.890-12");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2300.99);
        System.out.println("-------------");
        funcionario.imprimir();
    }
}
