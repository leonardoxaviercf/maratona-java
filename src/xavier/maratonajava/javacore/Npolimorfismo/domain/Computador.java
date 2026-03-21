package xavier.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.17;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}
