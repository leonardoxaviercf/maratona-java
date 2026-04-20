package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Leonardo");
        Consumidor c2 = new Consumidor("Xavier");

            NavigableMap<String, String> map = new TreeMap<>();

        map.put("Leo", "Xave");
        map.put("Ole", "Vasco");
        map.put("Sim", "Não");

        // O NavigableMap ordena pela chave
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("Ole", true));
        System.out.println(map.ceilingKey("Ole"));
        System.out.println(map.higherKey("Ole"));
        System.out.println(map.lowerKey("Ole"));
        System.out.println(map.floorKey("Ole"));
    }
}
