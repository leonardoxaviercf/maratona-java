package xavier.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getDayOfMonth());
        // Todas os outros métodos de get vistos antes


    }
}
