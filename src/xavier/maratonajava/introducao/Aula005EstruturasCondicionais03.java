package xavier.maratonajava.introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String  mensagemDoar = "Eu vou doar R$500";
        String mesansagemNaoDoar = "Ainda não tenho condiçõeas";
        String resultado = salario > 5000 ? mensagemDoar : mesansagemNaoDoar;

        System.out.println(resultado);
    }
}