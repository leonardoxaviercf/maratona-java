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

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorPlayStation = 2500F;

        boolean isPlayStation5Compravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println("isPlayStation5Compravel: "+isPlayStation5Compravel);

        // + += -= *= /= %=
        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000; // Faz a mesma coisa que a linha de cima
        bonus -= 900;
        bonus *= 2;
        bonus /= 1.5;
        System.out.println("Bonus: "+bonus);

        int contador = 0;
        contador += 1;
        contador++;
        System.out.println("Contador: "+contador);
    }
}