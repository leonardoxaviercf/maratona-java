package xavier.maratonajava.javacore.Npolimorfismo.test;

import xavier.maratonajava.javacore.Npolimorfismo.domain.Computador;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import xavier.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo", 2300);
        Tomate tomate  = new Tomate("Tomate de feira", 8.50);
        Televisao televisao = new Televisao("LG Q35", 950);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImpostoProduto(televisao);
    }
}
