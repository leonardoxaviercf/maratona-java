package xavier.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula003TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String endereco = "Rua dos Alfaneiros N4";
        float salario = 2345.6F;
        String dataRecebimento = "06/03/2026";

        String relatorio = "Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário R$"+salario+" na data "+dataRecebimento+".";

        System.out.println(relatorio);
    }
}
