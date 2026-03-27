package xavier.maratonajava.javacore.Oexecption.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Leitor1 closed");
    }
}
