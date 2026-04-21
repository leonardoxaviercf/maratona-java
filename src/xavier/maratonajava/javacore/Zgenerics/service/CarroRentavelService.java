package xavier.maratonajava.javacore.Zgenerics.service;

import xavier.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ford"), new Carro("Fiat")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar: " + carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Retornando carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: " + carrosDisponiveis);
    }
}
