package xavier.maratonajava.introducao;

public class Aula008ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Exemplo de array para guardar os meses  do ano e outro array para guardar os dias do mês
        // 1, 2, 3, 4, 5... Meses por ano
        // 31, 28, 31, 30... Dias por mês
        int[][] dias = new int[3][3];

        // Maneira de adicionar os valores na mão e depois imprimir
//        dias[0][0] = 1;
//        dias[0][1] = 2;
//        dias[0][2] = 3;
//        dias[1][0] = 4;
//        dias[1][1] = 5;
//        dias[1][2] = 6;
//        dias[2][0] = 7;
//        dias[2][1] = 8;
//        dias[2][2] = 9;

        // Adicionando e imprimindo de acordo com o laço
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                dias[i][j] = j;
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("Fim da iteração");

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;
        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int[] arrayBase : dias) {
            for (int dia : arrayBase) {
                System.out.println(dia);
            }
        }
    }
}
