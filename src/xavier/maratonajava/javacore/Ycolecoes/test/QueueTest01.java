package xavier.maratonajava.javacore.Ycolecoes.test;

import xavier.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("C");
        fila.add("A");
        fila.add("B");

        // peek - sempre pega o primeiro elemento sem remover da fila
        // poll - sempre pega o primeiro elemento mas remove da fila
        // offer - funcina de maneira semelhante ao add
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }



//        for (String s : fila) {
//            System.out.println(s);
//        }
//
//        System.out.println(fila);
    }
}
