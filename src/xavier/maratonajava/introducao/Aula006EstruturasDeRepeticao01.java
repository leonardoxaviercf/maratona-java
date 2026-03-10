package xavier.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 12;
        while (count  < 10) {
            System.out.println(++count);
        }

        // mesmo com a condição não sendo verdadeira, o laço ainda executa pelo menos uma vez
        do {
            System.out.println("Dentro do do while - "+ ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+ i);
        }
    }
}
