package xavier.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime now2 = now.atZone(tokyoZone);
        System.out.println(now2);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime now3 = nowInstant.atZone(tokyoZone);
        System.out.println(now3);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetAcre = ZoneOffset.of("-02:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetAcre);
        System.out.println(offsetDateTime);
    }
}
