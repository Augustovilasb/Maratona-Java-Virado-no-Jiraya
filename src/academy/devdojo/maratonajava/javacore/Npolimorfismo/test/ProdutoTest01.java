package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.MemoryRam;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculationTax;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador asus = new Computador("RYZEN 99850x3d", 25000);
        MemoryRam corsair = new MemoryRam("Corsair Vengeance", 4000);

        System.out.println(" ");
        CalculationTax.calculationTaxProduto(asus);
        System.out.println(" ");
        CalculationTax.calculationTaxProduto(corsair);
        System.out.println(" ");

    }
}
