package xavier.maratonajava.javacore.Kenum.test;

import xavier.maratonajava.javacore.Kenum.domain.Cliente;
import xavier.maratonajava.javacore.Kenum.domain.TipoCliente;
import xavier.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Xavier", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Clara",  TipoCliente.PESSOA_JURIDICA, TipoPagamento.ESPECIE);
        Cliente cliente4 = new Cliente("Maria",  TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(TipoPagamento.PIX.calcularValorPagamento(100));
        System.out.println(TipoPagamento.DEBITO.calcularValorPagamento(100));
        System.out.println(TipoPagamento.CREDITO.calcularValorPagamento(100));
        System.out.println(TipoPagamento.ESPECIE.calcularValorPagamento(100));

//        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa Fisica");
//        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
