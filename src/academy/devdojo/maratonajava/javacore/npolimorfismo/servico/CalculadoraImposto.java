package academy.devdojo.maratonajava.javacore.npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " +computador.getNome());
        System.out.println("Valor " +computador.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " +tomate.getNome());
        System.out.println("Valor " +tomate.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    }

    public static void calcularImpostoTelevisao(Televisao televisao){
        System.out.println("Relatorio de imposto da televisao");
        double imposto = televisao.calcularImposto();
        System.out.println("Televisao " +televisao.getNome());
        System.out.println("Valor " +televisao.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    }

    // refatorando o codigo, usar a superclasse inves de subclasse


    /* public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preço " +produto.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    */
}
