package xavier.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Leonardo"; // String constant pool
        String nome2 = "Leonardo";
        String nome3 = new String("Leonardo");


        System.out.println(nome == nome2);
    }
}
