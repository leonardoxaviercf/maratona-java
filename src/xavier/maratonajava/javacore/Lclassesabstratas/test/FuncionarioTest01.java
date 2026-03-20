package xavier.maratonajava.javacore.Lclassesabstratas.test;

import xavier.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import xavier.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import xavier.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 3600);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprimir();
        desenvolvedor.imprimir();
    }
}