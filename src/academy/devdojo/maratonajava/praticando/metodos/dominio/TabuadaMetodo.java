package academy.devdojo.maratonajava.praticando.metodos.dominio;

import java.util.Scanner;

public class TabuadaMetodo {

    public void printTabuada(Scanner scanner) {
        int tabuada = 0;
        int numero = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            tabuada = numero * i ;
        System.out.println("A tabuada do número " + numero + " * " + i + " é: " + tabuada);
        }
    }
}
