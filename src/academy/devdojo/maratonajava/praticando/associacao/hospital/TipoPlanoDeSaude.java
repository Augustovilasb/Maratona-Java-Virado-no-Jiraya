package academy.devdojo.maratonajava.praticando.associacao.hospital;

public enum TipoPlanoDeSaude {

    PLANO_DIAMANTE {
        @Override
        public double CalculoDesconto(double valor) {
            return valor * 0.5;
        }
    },

    PLANO_GOLD {
        @Override
        public double CalculoDesconto(double valor) { return valor * 0.3; }
    },

    PLANO_SILVER {
        @Override
        public double CalculoDesconto(double valor) { return valor * 0.1; }
    };

    public abstract double CalculoDesconto(double valor);
}
