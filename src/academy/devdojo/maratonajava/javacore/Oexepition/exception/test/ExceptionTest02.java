package academy.devdojo.maratonajava.javacore.Oexepition.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
//try = tenta
//catch = pega
// ou seja.. caso aconteça alguma coisa, e se acontecer..
// logica de negocio nao deve ser tratada dentro do catch