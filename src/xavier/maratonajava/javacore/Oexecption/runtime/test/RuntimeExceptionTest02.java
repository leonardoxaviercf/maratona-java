package xavier.maratonajava.javacore.Oexecption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(10, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal! Não pode dividir por 0");
        }

//        try {
//            return a/b;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        return a/b;
    }
}
