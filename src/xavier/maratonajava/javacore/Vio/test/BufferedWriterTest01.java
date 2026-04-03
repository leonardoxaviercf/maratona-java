package xavier.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) { // Esse true serve para saber se devemos sobrescrever todo o arquivo ou apenas adicionar ao final dele
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Isso é um teste.");
            bw.newLine();
            bw.write("Por favor Interpol, if you estiver me investigando I dont have nothing a ver com o crime.");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
