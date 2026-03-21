package xavier.maratonajava.javacore.Npolimorfismo.service;

import xavier.maratonajava.javacore.Npolimorfismo.domain.Computador;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Produto;
import xavier.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    // Esse código específico não é escalável quanto o generalista abaixo
//    public static void calcularImpostoComputador(Computador computador){
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getPreco());
//        System.out.println("Imposto a ser pago do computador: " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getPreco());
//        System.out.println("Imposto a ser pago do tomate: " + imposto);
//    }

    // Ao fazermos isso, estamos desacoplando nosso código, deixando mais amplo para a classe pai produto
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        System.out.println("Imposto a ser pago do produto: " + imposto);
    }
}
