package xavier.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 100000;
        float salarioFloat = 3000.5F;
        double salarioDouble = 2000.0;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'L';

        // Os valores de armazenamento (em quantidade de bits) estão docs

        // Posso "forçar" uma variável a caber dentro da outra
        int idadeGrande = (int) 10000000000L;

        System.out.println("Idade: "+ idade+" anos.");
        System.out.println("Capacidade máxima da idade grande: "+idadeGrande);
        System.out.println(numeroGrande);
        System.out.println(salarioFloat);
        System.out.println(salarioDouble);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
    }
}
