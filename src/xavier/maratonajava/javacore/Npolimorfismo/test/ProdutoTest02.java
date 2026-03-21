package xavier.maratonajava.javacore.Npolimorfismo.test;

import xavier.maratonajava.javacore.Npolimorfismo.domain.Computador;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Produto;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Asus Vivobook", 2300);
        Produto produto2 = new Tomate("Tomate da fazendo", 12);

        System.out.println("Computador:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: " + produto1.getPreco());
        System.out.println("Imposto: " + produto1.calcularImposto());
        System.out.println("----------------------");
        System.out.println("Tomate:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preco: " + produto2.getPreco());
        System.out.println("Imposto: " + produto2.calcularImposto());
    }
}
