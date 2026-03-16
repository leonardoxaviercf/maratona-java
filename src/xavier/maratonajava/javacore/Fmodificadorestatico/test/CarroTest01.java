package xavier.maratonajava.javacore.Fmodificadorestatico.test;


import xavier.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 320);
        Carro carro2 = new Carro("Camaro", 290);
        Carro carro3 = new Carro("Mercedes", 280);

//        carro1.setVelocidadeLimite(150);
        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
