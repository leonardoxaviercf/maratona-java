package xavier.maratonajava.introducao;

public class Aula007Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 15;
        numeros[1] = 18;
        numeros[2] = 21;

        int[] numeros2 = {15, 18, 21};

        int[] numeros3 = {5, 4, 3, 2, 1};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
