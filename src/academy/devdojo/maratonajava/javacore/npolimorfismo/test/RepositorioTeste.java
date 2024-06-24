package academy.devdojo.maratonajava.javacore.npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("vegeta");
        list.add("kuririn");
        System.out.println(list);
    }
}
