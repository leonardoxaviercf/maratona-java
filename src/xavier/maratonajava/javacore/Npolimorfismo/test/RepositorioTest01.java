package xavier.maratonajava.javacore.Npolimorfismo.test;

import xavier.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import xavier.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import xavier.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados(); // Posso trocar por qualquer objeto que irá continuar funcionando
        // Isso se dá pela programação voltada a interfaces
//        Repositorio repositori = new RepositorioArquivo(); Esse código funcionaria perfeitamente, pois agora não estou
//        chamando o método para o objeto RepostitorioBancoDeDados e sim pro Repositorio mais geral

        List<String> list =  new ArrayList<>();
        list.add("Bola");
        list.add("Chaveiro");
        list.add("Ventilador");

        System.out.println(list);

        repositorio.salvar();
    }
}
