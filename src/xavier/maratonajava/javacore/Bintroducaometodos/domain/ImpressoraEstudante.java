package xavier.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante){
        System.out.println("------------");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("------------");

        // Isso não segue as boas práticas mas é apenas um exemplo do acesso direto no endereço de memória do objeto
        estudante.nome = "Sherlock";
    }
}
