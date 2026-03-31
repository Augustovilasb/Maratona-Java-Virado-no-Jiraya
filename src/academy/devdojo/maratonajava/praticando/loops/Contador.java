package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número?");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if ( i % 2 == 0) {
                System.out.println(i + " Par");
            } else {
                System.out.println(i + " Impar");
            }
        }
    }
}