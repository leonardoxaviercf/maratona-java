package xavier.maratonajava.javacore.Jmodificadorfinail.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprimir() {
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
