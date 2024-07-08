package academy.devdojo.maratonajava.javacore.Oexepition.runtime.test;

public class RunTimeExeceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }
    private static int divisao (int a, int b){
       if(b == 0) {
           throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
       }
       return a/b;

    }
}


/* private static int divisao (int a, int b){
       try {
           return a/b;
       }catch (RuntimeException e) {
           e.printStackTrace();
       }
       return 0;
*/
