package xavier.maratonajava.introducao;

public class Aula005EstruturasCondicionais04 {
    public static void main(String[] args) {
        // $0 - $34,712 = 9.70%
        // $34,713 - $68,507 = 37.35%
        // +$68,508 = 49.50%
        double salarioAnual = 70000;
        double primeiraFaixa = 0.0970;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.4950;
        double valorImposto;


        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O imposto a ser pago será: R$"+valorImposto);
    }
}