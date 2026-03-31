package academy.devdojo.maratonajava.praticando.loops;

import java.util.Random;
import java.util.Scanner;

public class PraticandoLooPBreak13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ql seu palpite?");
        int numeroSecreto = scanner.nextInt();

        Random random = new Random();

        int[] listaAleatoria = new int[5000];

        for (int numeroQualquer = 0; numeroQualquer < listaAleatoria.length; numeroQualquer++) {
            listaAleatoria[numeroQualquer] = random.nextInt(5000);
        }

        int tentativas = 0;
        int numeroFinal = 0;

        for (int numero : listaAleatoria) {
            tentativas++;
            if (numero == numeroSecreto) {
                System.out.println("Numero encontrado: " + numero);
                break;
            } else {
                System.out.println("Tentativa de número " + tentativas + " com o número: " + numero);
            }
                numeroFinal = numero;
        }
                System.out.println("Foram realizadas " + tentativas + " tentativas para encontrar o Número: " + numeroFinal);
    }
}