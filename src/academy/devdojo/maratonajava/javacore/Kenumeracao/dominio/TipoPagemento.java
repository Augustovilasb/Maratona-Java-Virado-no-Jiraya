package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

    public enum TipoPagemento {

        DEBITO {
            @Override
            public double CalculoDesconto(double valor) {
                return valor * 0.1;
            }
        },
        
        CREDITO {
            @Override
            public double CalculoDesconto(double valor) {
                return valor * 0.05;
            }
        };

        public abstract double CalculoDesconto(double valor);

    }