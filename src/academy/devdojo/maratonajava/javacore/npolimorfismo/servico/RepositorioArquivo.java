package academy.devdojo.maratonajava.javacore.npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
