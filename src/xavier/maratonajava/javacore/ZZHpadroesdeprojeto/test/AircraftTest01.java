package xavier.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import xavier.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(String.valueOf(aircraft.bookSeat(seat)));
    }
}
