package xavier.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> manga =  new ArrayList<>(6);

        manga.add("Naruto");
        manga.add("DBZ");
        manga.add("AOT");
        manga.add("Berserk");

//        Collections.sort(nomes);
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(10.50);
        dinheiros.add(23.54);
        dinheiros.add(34D);
        dinheiros.add(126.21);

        Collections.sort(dinheiros);

        for  (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        for (String nome : manga){
            System.out.println(nome);
        }
    }
}
