package xavier.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("Brazil: " + df1.format(calendar.getTime()));
        System.out.println("Italy: " + df2.format(calendar.getTime()));

        System.out.println(localeBrazil.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
    }
}
