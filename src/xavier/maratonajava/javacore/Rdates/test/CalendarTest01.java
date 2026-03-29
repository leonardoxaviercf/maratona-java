package xavier.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana!");
        }
        System.out.println(calendar.get(calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.HOUR_OF_DAY, 1);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
