package academy.devdojo.maratonajava.javacore.npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
