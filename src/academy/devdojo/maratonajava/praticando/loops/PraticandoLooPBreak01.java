package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class PraticandoLooPBreak01 {
    public static void main(String[] args) {

        // Dado o valor de um carro
        // descubra quantas vezes ele pode ser parcelado
        // Desde que o valor da parcela seja >= 1000;

        // double valorCarro = 30000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do carro?");
        double valorCarro = scanner.nextDouble();

        for (int numParcela = 1; numParcela <= valorCarro; numParcela++) {
                double valorParcela = valorCarro/numParcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.println("Número de parcelas é de " + numParcela + " com o valor de R$" + valorParcela);
        }
    }
}