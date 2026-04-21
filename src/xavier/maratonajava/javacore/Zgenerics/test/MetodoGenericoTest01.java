package xavier.maratonajava.javacore.Zgenerics.test;

import xavier.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoLista = criarArrayComUmObjeto(new Barco("Canoa Furada"));
        System.out.println(barcoLista);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }
}