package xavier.maratonajava.javacore.Kenum.domain;

public class Cliente {
    public enum TipoPagamento {
        DEBITO,
        CREDITO,
        PIX,
        ESPECIE,
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String toString() {
        return "Nome: " + nome + " | Tipo Cliente: " + tipoCliente + " | Tipo Cliente Int: " + tipoCliente.VALOR + " | Tipo Cliente Relatorio: " + tipoCliente.getNomeRelatorio() + " | Tipo Pagamento: " + tipoPagamento;
    }
}
