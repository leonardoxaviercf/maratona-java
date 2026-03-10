package xavier.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 10000

        for (int i = 0; i <= 10000; i++) { // substitui i++ por i += 2 no exemplo abaixo
            // System.out.println("Número "+ i + " é par!");
            // é uma forma válida, porém se a regra de negócio mudar, por exemplo o i começar em 1, o código quebra
            if (i % 2 == 0) {
                System.out.println("Número "+ i + " é par!");
            }
        }
    }
}
