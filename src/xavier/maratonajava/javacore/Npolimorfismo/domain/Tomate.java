package xavier.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.09;
    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}
