package xavier.maratonajava.javacore.Aintroducaoclasses.test;

import xavier.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Palio";
        carro1.modelo = "Básico";
        carro1.ano = 2006;

        carro2.nome = "Gol";
        carro2.modelo = "Completo";
        carro2.ano = 2020;

        // Referência de objetos - Posso atribuir um objeto já criado para uma variável de referência. Ex:
        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);
    }
}
