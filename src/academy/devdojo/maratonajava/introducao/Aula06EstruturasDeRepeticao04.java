package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        // Dado o valor de um carro
        // descubra quantas vezes ele pode ser parcelado
        // Valor da parcela >= 1000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do carro? ");
        double valorCarro = scanner.nextInt();

        for (int numParcela = 1; numParcela <= valorCarro; numParcela++) {
            double valorParcela = valorCarro / numParcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela de número " + numParcela + ", no valor de R$ " + valorParcela);
        }
    }
}
