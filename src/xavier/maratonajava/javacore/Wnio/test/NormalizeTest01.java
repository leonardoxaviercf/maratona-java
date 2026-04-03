package xavier.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/xavier/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
