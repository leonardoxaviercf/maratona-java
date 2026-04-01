package xavier.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(text);
        Matcher matcher2 = pattern.matcher(text2);

        System.out.println("Text1: " + text);
        System.out.println("Index: 01234456789");
        System.out.println("Text2: " + text2);
        System.out.println("Index: 01234456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher1.find()) {
            System.out.print(matcher1.start() + ", ");
        }

        System.out.println();

        while (matcher2.find()) {
            System.out.print(matcher2.start() + ", ");
        }
    }
}
