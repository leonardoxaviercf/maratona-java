package xavier.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(21, 24, 54);
        LocalTime agora = LocalTime.now();

        System.out.println(lt);
        System.out.println(agora);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
