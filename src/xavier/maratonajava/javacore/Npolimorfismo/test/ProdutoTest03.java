package xavier.maratonajava.javacore.Npolimorfismo.test;

import xavier.maratonajava.javacore.Npolimorfismo.domain.Computador;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Produto;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import xavier.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Asus Vivobook", 2300);
        Tomate tomate = new Tomate("Tomate da fazendo", 12);
        tomate.setDataValidade("26/03/2030");

        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImpostoProduto(produto1);
    }
}
