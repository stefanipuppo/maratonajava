package academy.devdojo.maratonajava.javacore.Oexepition.exception.test;

import academy.devdojo.maratonajava.javacore.Oexepition.exception.dominio.Leitor01;
import academy.devdojo.maratonajava.javacore.Oexepition.exception.dominio.Leitor02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02= new Leitor02()){

        } catch (IOException e) {

        }
    }
}
