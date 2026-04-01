package xavier.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String d1 = date.format(DateTimeFormatter.ISO_DATE);
        String d2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String d3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDate parse1 = LocalDate.parse("20260401", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        // Para casos onde nenhum padrão de formatação se encaixa com o nosso, podemos criar uma nova formatação
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatoBR = LocalDate.now().format(formatterBR);
        System.out.println(formatoBR);

        LocalDate dataBR = LocalDate.parse("01/04/2026", formatterBR);
        System.out.println(dataBR);
    }
}
