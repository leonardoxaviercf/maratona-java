package xavier.maratonajava.javacore.Oexecption.exception.test;

import xavier.maratonajava.javacore.Oexecption.exception.domain.Leitor1;
import xavier.maratonajava.javacore.Oexecption.exception.domain.Leitor2;

import java.io.*;

public class TryWithResoucersTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lerArquivo2() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
