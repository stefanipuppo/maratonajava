package academy.devdojo.maratonajava.javacore.Oexepition.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }
}
