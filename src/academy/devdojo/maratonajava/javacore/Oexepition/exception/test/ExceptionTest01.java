package academy.devdojo.maratonajava.javacore.Oexepition.exception.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//try = tenta
//catch = pega
// ou seja.. caso aconteça alguma coisa, e se acontecer..
// logica de negocio nao deve ser tratada dentro do catch