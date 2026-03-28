package xavier.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatenarString(100000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para String: " + (fim - inicio) + " ms");

        long comeco = System.currentTimeMillis();
        concatenarStringBuilder(1000000);
        long end = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuilder: " + (end - comeco) + " ms");

        long start = System.currentTimeMillis();
        concatenarStringBuffer(1000000);
        long finalizar = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuffer: " + (finalizar - start) + " ms");
    }

    private static void concatenarString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
             texto += i;
        }
    }

    private static void concatenarStringBuilder(int tamanho) {
        StringBuilder texto2 = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto2.append(i);
        }
    }

    private static void concatenarStringBuffer(int tamanho) {
        StringBuffer texto2 = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto2.append(i);
        }
    }
}
