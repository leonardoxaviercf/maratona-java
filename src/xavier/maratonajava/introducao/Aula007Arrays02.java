package xavier.maratonajava.introducao;

public class Aula007Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char = '\u0000' -> Espaço em branco
        // boolean f = false
        // String = null
        String[] nomes = new String[3];

        nomes[0] = "Leonardo Xavier";
        nomes[1] = "Maria Clara";
        nomes[2] = "Maria Flor";

        for (int i =0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
