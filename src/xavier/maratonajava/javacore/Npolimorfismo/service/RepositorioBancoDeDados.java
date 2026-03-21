package xavier.maratonajava.javacore.Npolimorfismo.service;

import xavier.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco dados");
    }
}
