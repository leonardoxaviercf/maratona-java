package xavier.maratonajava.javacore.Zgenerics.test;

import xavier.maratonajava.javacore.Zgenerics.domain.Barco;
import xavier.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGeneriaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();

        System.out.println("Usando barco por 1 mês...");

        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
