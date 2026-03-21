package xavier.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.16;
    public Televisao(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando imposto da televisão");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}
