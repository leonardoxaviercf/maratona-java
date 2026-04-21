package xavier.maratonajava.javacore.Zgenerics.service;

import xavier.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }



    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar: " + objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Retornando objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: " + objetosDisponiveis);
    }
}
