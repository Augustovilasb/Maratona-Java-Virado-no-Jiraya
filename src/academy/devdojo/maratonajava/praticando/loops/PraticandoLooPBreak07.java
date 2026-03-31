package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class PraticandoLooPBreak07 {
    public static void main(String[] args) {

        // Cada garrafa de vinho custa R$45
        // Cada queijo custa R$20
        // Cada pão artesanal custa R$8
        // O orçamento total é R$200
        // Ela precisa comprar pelo menos 2 garrafas de vinho
        // Ela quer comprar o máximo possível de queijos e pães, sem ultrapassar o orçamento

        double precoVinho = 45;
        double precoQueijo = 20;
        double precoPao = 8;
        int qntGarrafaVinho = 2;
        int qntQueijoComprada = 0;
        int qntPaoComprada = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ql é o seu orçamento?");
        double orcamentoTotal = scanner.nextDouble();

        double totalGasto = precoVinho * qntGarrafaVinho;

        for (qntQueijoComprada = 0; totalGasto + precoQueijo <= orcamentoTotal; qntQueijoComprada++) {
            totalGasto += precoQueijo;
        }

        for (qntPaoComprada = 0; totalGasto + precoPao <= orcamentoTotal; qntPaoComprada++) {
            totalGasto += precoPao;
        }

        double resto = orcamentoTotal - totalGasto;

        System.out.println("Ela vai comprar " + qntGarrafaVinho + " de vinho.");
        System.out.println("Ela vai comprar " + qntPaoComprada + " de pao.");
        System.out.println("Ela vai comprar " + qntQueijoComprada + " de queijo.");
        System.out.println("Gastando um total de R$" + totalGasto);
        System.out.println("E vai ter uma sobra de R$ " + resto);
    }
}
