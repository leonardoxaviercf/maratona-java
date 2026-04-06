package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Samsung");
        Smartphone s2 = new Smartphone("1ABC2", "Samsung");
//        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
