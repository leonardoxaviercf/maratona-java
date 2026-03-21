package xavier.maratonajava.javacore.Npolimorfismo.test;

import xavier.maratonajava.javacore.Npolimorfismo.domain.Computador;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Produto;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import xavier.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Asus Vivobook", 2300);
        Produto produto2 = new Tomate("Tomate da fazendo", 12);
        Produto produto3 = new Televisao("LG Q45", 1250);

//        System.out.println("Computador:");
//        System.out.println("Nome: " + produto1.getNome());
//        System.out.println("Preco: " + produto1.getPreco());
//        System.out.println("Imposto: " + produto1.calcularImposto());
//        System.out.println("----------------------");
//        System.out.println("Tomate:");
//        System.out.println("Nome: " + produto2.getNome());
//        System.out.println("Preco: " + produto2.getPreco());
//        System.out.println("Imposto: " + produto2.calcularImposto());


//        CalculadoraImposto.calcularImpostoComputador(produto1); Isso não funciona pois a variável de referência não é mais um computador e sim um produto
        System.out.println("------------");
        CalculadoraImposto.calcularImpostoProduto(produto1);
//        A volta funciona normalmente, eu posso passar uma variável de referência do tipo computador para uma entrada do tipo produto
//        Porém eu não posso passar uma variável de referência do tipo produto para uma entrada do tipo computador, pois é mais específico

//        CalculadoraImposto.calcularImpostoTomate(produto2); Isso não funciona pois a variável de referência não é mais um tomate e sim um produto
        System.out.println("------------");
        CalculadoraImposto.calcularImpostoProduto(produto2);

        System.out.println("------------");
        CalculadoraImposto.calcularImpostoProduto(produto3);
    }
}
