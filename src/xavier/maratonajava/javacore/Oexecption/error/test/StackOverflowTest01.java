package xavier.maratonajava.javacore.Oexecption.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividada();
    }

    public static void recursividada() {
        recursividada();
    }
}
