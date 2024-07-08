package academy.devdojo.maratonajava.javacore.Oexepition.exception.test;

import academy.devdojo.maratonajava.javacore.Oexepition.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexepition.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

    }
}
