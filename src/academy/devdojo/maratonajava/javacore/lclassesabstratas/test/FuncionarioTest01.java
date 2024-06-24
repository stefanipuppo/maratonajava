package academy.devdojo.maratonajava.javacore.lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Stefani", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
