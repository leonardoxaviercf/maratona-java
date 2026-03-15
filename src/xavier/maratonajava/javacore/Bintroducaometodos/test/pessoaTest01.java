package xavier.maratonajava.javacore.Bintroducaometodos.test;

import xavier.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Naruto");
        pessoa.setIdade(32);

//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());

        pessoa.imprimir();


    }
}
