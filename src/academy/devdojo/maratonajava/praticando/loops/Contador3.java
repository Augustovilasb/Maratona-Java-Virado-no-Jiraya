package academy.devdojo.maratonajava.praticando.loops;

import java.util.Scanner;

public class Contador3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o número?");
        int numInput = scanner.nextInt();
        int somaInput = 1;

        for (int i = 1; i <= numInput; i++) {
            somaInput = somaInput * i;
        }
            System.out.println(somaInput);
    }
}