package academy.devdojo.maratonajava.javacore.npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50 ", 5000);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImpostoTelevisao(televisao);
    }

    /*
    CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(televisao);
    */
}
