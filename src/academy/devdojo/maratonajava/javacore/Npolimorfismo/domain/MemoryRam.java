package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class MemoryRam extends Produto{

    public static final double IMPOSTO_MEMORYRAM = 0.40;

    public MemoryRam(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calculationTax() {
        return this.valor * IMPOSTO_MEMORYRAM;
    }
}
