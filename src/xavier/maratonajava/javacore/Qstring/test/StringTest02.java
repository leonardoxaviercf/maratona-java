package xavier.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "            Maria";
        String numeros = "0123456789";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replaceAll("a", "o"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.trim());

        System.out.println(numeros.substring(0, 5));
    }
}
