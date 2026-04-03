package xavier.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) { // Esse true serve para saber se devemos sobrescrever todo o arquivo ou apenas adicionar ao final dele
            fw.write("\nIsso é um teste.\nPor favor Interpol, if you estiver me investigando I dont have nothing a ver com o crime.");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
