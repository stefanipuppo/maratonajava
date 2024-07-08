package academy.devdojo.maratonajava.javacore.Oexepition.runtime.test;

public class RunTimeExeceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO ");
        }
        return null;
    }
}
