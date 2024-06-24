package academy.devdojo.maratonajava.javacore.npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
