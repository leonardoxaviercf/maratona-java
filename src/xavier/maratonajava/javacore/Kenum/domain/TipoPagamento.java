package xavier.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
        DEBITO {
            @Override
            public double calcularValorPagamento(double valor) {
                return valor * 0.95;
            }
        },
        CREDITO {
            @Override
            public double calcularValorPagamento(double valor) {
                return valor * 1.1;
            }
        },
        PIX {
            @Override
            public double calcularValorPagamento(double valor) {
                return valor * 0.9;
            }
        },
        ESPECIE {
            @Override
            public double calcularValorPagamento(double valor) {
                return valor;
            }
        };

        public abstract double calcularValorPagamento(double valor);
    }