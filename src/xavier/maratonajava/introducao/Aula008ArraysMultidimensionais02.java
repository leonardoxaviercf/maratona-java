package xavier.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayBase = new int[3][];

        arrayBase[0] = new int[2];

//      arrayBase[1] = new int[3];
//      Posso iniciar dessa forma também
        arrayBase[1] = new int[]{1, 2, 3, 4, 5, 6};

//      Também é possível iniciar dessa forma
        int[] arrayExemplo = {1, 2, 3};
        arrayBase[2] = arrayExemplo;

        for (int[] linha : arrayBase) {
            System.out.println("\n-----");
            for (int num : linha) {
                System.out.print(num + " ");
            }
        }

//      Por fim, temos esse tipo de inicialização também
        int[][] arrayBase2 = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println();

        for (int[] linha : arrayBase2) {
            System.out.println("\n----");
            for (int num : linha) {
                System.out.print(num + " ");
            }
        }
    }
}

