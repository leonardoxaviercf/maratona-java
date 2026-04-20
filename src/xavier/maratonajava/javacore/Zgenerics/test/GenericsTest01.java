package xavier.maratonajava.javacore.Zgenerics.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista =  new ArrayList<>();
        lista.add("Midoriya");
//        lista.add(123L);
//        lista.add(new Consumidor("Leonardo"));
        lista.add("Xavier");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Xavier"));
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
