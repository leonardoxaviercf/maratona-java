package xavier.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Metacaracter


        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";

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
