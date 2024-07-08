package academy.devdojo.maratonajava.javacore.Oexepition.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExeceptionTest04 {
    public static void main(String[] args) {
    try {
        throw new RuntimeException();
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(" Dentro do ArrayIndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        System.out.println(" Dentro do IndexOutOfBoundsException");
    } catch (IllegalArgumentException e) {
        System.out.println( " Dentro do IllegalArgumentException ");
    } catch (ArithmeticException e) {
        System.out.println(" Dentro do ArithmeticException");
    } catch (RuntimeException e) {
        System.out.println(" Dentro do RuntimeException ");
    }

    try {
        talvesLanceException();
    }catch (SQLException throwables) {
        throwables.printStackTrace();
    }catch (FileNotFoundException e) {
        e.printStackTrace();
    }


}

    private static void talvesLanceException() throws SQLException,FileNotFoundException{

    }
}


// execoes genericas devem ser sempre no final
//runtimeexception é uma exeçao generica, as outras exeçoes sao filhas do runtimeexception