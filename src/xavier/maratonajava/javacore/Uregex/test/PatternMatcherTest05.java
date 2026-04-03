package xavier.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Metacaracter


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "goku@hotmail.com, 123vegeta@gmail.com, %^&@#zoro@mail.br, teste@outlook.com.br, sakura@mail.com";

        System.out.println("Email válido");
        System.out.println("%^&@#zoro@mail.br".matches(regex));
        System.out.println("goku@hotmail.com".matches(regex));

        System.out.println(Arrays.toString(text.split(",")));
        System.out.println(text.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(text);

        System.out.println("Text1: " + text);
        System.out.println("Index: 01234456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher1.find()) {
            System.out.print(matcher1.start() + ", "+ matcher1.group() + "\n ");
        }
    }
}
