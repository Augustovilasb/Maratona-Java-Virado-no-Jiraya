package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class Contador4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número?");
        int numInput = scanner.nextInt();

        int somaFinal = 0;

        for (int i = 1; i < numInput; i++) {
            if (numInput % i == 0) {
                somaFinal = somaFinal + i;
            }
        }
        if (somaFinal == numInput) {
            System.out.println(numInput + " é perfeito.");
        } else {
            System.out.println(numInput + " não é perfeito.");
        }
    }
}
