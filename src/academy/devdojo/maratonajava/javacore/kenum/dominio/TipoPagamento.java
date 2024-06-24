package academy.devdojo.maratonajava.javacore.kenum.dominio;

public enum TipoPagamento {
        DEBIDO {
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.1;
                }
        }, CREDITO {
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.05;
                }
        };

        public abstract double calcularDesconto(double valor);
}