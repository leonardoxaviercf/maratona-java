package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double[] numeros = {5, 4, 9, 12, 17};

        calculadora.somaArray(numeros);

        // Diferença entre trabalhar com array diretamente do que com VarArgs. Posso passar tanto
        // o próprio array, quanto argumentos separados como parâmetro da chamada da função
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);

    }
}
