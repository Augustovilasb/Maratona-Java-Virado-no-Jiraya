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

//    public static void calculationTaxComputador(Computador computador) {
//        System.out.println("Statement Tax Computer");
//        double tax = computador.calculationTax();
//        System.out.println("Name Computer: " + computador.getName());
//        System.out.println("Value Computer: " + computador.getValor());
//        System.out.println("Tax on Computer: " + tax);
//    }
//
//    public static void calculationTaxComputador(MemoryRam memoryRam) {
//        System.out.println("Statement Tax Memory Ram");
//        double tax = memoryRam.calculationTax();
//        System.out.println("Name Memory Ram: " + memoryRam.getName());
//        System.out.println("Value Memory Ram: " + memoryRam.getValor());
//        System.out.println("Tax on Memory Ram: " + tax);
//    }
}
