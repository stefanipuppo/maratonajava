package academy.devdojo.maratonajava.javacore.minterfaces.dominio;

public interface DataLoader {
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    }
}
