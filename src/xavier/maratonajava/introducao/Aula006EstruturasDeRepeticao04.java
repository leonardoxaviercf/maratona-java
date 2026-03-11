package xavier.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: valorDaParcela >= 1000
        double valorTotal = 30000;

        // Esse código funciona normalmente, mas tem uma maneira mais clean de resolver esse problema
//        for (int parcela = 1; parcela <= valorTotal; parcela++) {
//            double valorDaParcela = valorTotal / parcela;
//            if (valorDaParcela    >= 1000) {
//                System.out.println("Parcela: " + parcela + " R$" + valorDaParcela);
//            } else {
//                break;
//            }
//        }
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorDaParcela = valorTotal / parcela;
            if (valorDaParcela < 1000) {
                break;
            }

            System.out.println("Parcela: " + parcela + " R$" + valorDaParcela);
        }
    }
}
