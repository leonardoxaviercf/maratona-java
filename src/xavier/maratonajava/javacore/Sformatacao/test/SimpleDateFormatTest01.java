package xavier.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Ceará-Mirim' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));
    }
}
