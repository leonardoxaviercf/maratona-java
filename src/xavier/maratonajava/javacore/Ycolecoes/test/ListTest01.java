package xavier.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Xavier");
        nomes.add("Leonardo");

        nomes2.add("Samsung");
        nomes2.add("Apple");

        // Adiciona todos os valores de nomes2 em nomes
        nomes.addAll(nomes2);

//        nomes.remove("Leonardo");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
    }
}
