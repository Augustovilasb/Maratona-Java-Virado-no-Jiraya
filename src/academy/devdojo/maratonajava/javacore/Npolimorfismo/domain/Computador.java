package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto {

    public static final double IMPOSTO_COMPUTADOR = 0.25;

    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calculationTax() {
        return this.valor * IMPOSTO_COMPUTADOR;
    }
}
