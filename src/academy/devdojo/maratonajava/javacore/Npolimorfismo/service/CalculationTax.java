package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class CalculationTax {

    public static void calculationTaxProduto(Produto produto) {
        System.out.println("Statement Product Tax");
        double tax = produto.calculationTax();
        System.out.println("Product Name: " + produto.getName());
        System.out.println("Product Value: " + produto.getValor());
        System.out.println("Tax on Product: " + tax);
    }

}
