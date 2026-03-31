package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class Contador2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número?");
        int numPrimo = scanner.nextInt();

        boolean primo = true;
        for (int i = 2; i < numPrimo; i++) {
            if (numPrimo % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(numPrimo + " É primo.");
        } else {
            System.out.println(numPrimo + " Não é primo");
        }
    }
}