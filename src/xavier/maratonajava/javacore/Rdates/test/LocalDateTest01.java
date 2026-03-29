package xavier.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate ld = LocalDate.of(2004, Month.OCTOBER, 24);
        LocalDate agora = LocalDate.now();

        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.lengthOfMonth());
        System.out.println(ld.isLeapYear());
        System.out.println(ld.get(ChronoField.YEAR));

    }
}
