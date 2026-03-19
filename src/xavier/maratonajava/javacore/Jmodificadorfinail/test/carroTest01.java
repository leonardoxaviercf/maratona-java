package xavier.maratonajava.javacore.Jmodificadorfinail.test;

import xavier.maratonajava.javacore.Jmodificadorfinail.domain.Carro;
import xavier.maratonajava.javacore.Jmodificadorfinail.domain.Comprador;
import xavier.maratonajava.javacore.Jmodificadorfinail.domain.Ferrari;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Leonardo");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari F2");
        ferrari.imprimir();
    }
}
