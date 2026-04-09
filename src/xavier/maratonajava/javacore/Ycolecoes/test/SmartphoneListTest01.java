package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Samsung");
        Smartphone s2 = new Smartphone("222AB", "iPhone");
        Smartphone s3 = new Smartphone("ABABAB", "Pixel");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

//        smartphones.clear(); Limpa o arrayList

        for (Smartphone s: smartphones) {
            System.out.println(s);
        }

        Smartphone s4 = new Smartphone("222AB", "Pixel");
        smartphones.add(0, s4);

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
