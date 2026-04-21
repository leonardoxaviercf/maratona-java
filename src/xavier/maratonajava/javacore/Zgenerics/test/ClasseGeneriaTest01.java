package xavier.maratonajava.javacore.Zgenerics.test;

import xavier.maratonajava.javacore.Zgenerics.domain.Carro;
import xavier.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGeneriaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro1 = carroRentavelService.buscarCarroDisponivel();

        System.out.println("Usando carro por 1 mês...");

        carroRentavelService.retornarCarroAlugado(carro1);
    }
}
