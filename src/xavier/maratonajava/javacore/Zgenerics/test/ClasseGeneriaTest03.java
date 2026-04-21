package xavier.maratonajava.javacore.Zgenerics.test;

import xavier.maratonajava.javacore.Zgenerics.domain.Barco;
import xavier.maratonajava.javacore.Zgenerics.domain.Carro;
import xavier.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGeneriaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ford"), new Carro("Fiat")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate"), new Barco("Navio")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro1 = rentalServiceCarro.buscarObjetoDisponivel();

        System.out.println("Usando carro por 1 mês...");

        rentalServiceCarro.retornarObjetoAlugado(carro1);

        System.out.println("-----------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco barco1 = rentalServiceBarco.buscarObjetoDisponivel();

        System.out.println("Usando barco por 1 mês...");

        rentalServiceBarco.retornarObjetoAlugado(barco1);
    }
}
