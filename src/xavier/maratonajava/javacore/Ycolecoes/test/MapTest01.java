package xavier.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        Map<String, String> map = new LinkedHashMap<>(); Para termos os valores ordenados por inserção
        map.put("teckado", "teclado");
        map.put("mauze", "mouse");
        // Caso tenha a mesma chave para valores distintos, ele sobrescreve
        map.put("vc", "você2");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("-----------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("-----------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
