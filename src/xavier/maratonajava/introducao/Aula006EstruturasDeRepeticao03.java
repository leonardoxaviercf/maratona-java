package xavier.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um determinado valor. Por exemplo: 50
        int valorMaximo = 50;
        for (int i =0; i <= valorMaximo; i++) {
            System.out.println(i);
            if (i == 25) {
                break; // Encerra o laço de repetição
            }
        }
        System.out.println("Fora do laço.");
    }
}