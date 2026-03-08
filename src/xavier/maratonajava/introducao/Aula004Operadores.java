package xavier.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        int divisao = numero01 / numero02;
        System.out.println("Valor: "+ resultado);
        // Para essa divisão funcionar da maneira correta, pelo menos o n1 ou n2 deverão ser double ou float
        System.out.println("Valor divisao: "+ divisao);

        // %
        int resto = numero01 % numero02;
        System.out.println("Resto: "+ resto);

        //  < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezmenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("IsDezDiferenteVinte: "+isDezDiferenteVinte);
    }
}