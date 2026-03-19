package xavier.maratonajava.javacore.Kenum.test;

import xavier.maratonajava.javacore.Kenum.domain.Cliente;
import xavier.maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Xavier", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Clara",  TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Maria",  TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
