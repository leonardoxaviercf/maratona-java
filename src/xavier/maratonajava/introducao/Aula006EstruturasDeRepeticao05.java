package xavier.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorDaParcela = valorTotal / parcela;
            if (valorDaParcela < 1000) {
                continue;
            }

            System.out.println("Parcela: " + parcela + " R$" + valorDaParcela);
        }
    }
}
