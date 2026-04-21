package xavier.maratonajava.javacore.Zgenerics.service;

import xavier.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate"), new Barco("Navio")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponíveis para alugar: " + barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Retornando barco: " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: " + barcosDisponiveis);
    }
}
