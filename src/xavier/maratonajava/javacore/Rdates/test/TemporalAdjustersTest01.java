package xavier.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 25);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
//        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDate past = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        LocalDate firsDayOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(past);
        System.out.println(firsDayOfMonth);
        System.out.println(lastDayOfMonth);
    }
}
