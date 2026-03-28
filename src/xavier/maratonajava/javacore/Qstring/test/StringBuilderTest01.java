package xavier.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Leonardo";
        nome.concat(" Xavier");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" Xavier");
        sb.reverse();
        sb.delete(0, 3);

        System.out.println(sb);
    }
}
