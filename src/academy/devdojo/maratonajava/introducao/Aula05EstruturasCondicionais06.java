package academy.devdojo.maratonajava.introducao;

import javax.print.DocFlavor;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {

        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        // Uitlize Switch case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fala aq: ");
        byte dia = scanner.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Segunda, dia útil");
            case 2:
                System.out.println("Terça, dia útil");
            case 3:
                System.out.println("Quarta, dia útil");
            case 4:
                System.out.println("Quinta, dia útil");
            case 5:
                System.out.println("Sexta, dia útil");
                break;
            case 6:
                System.out.println("Sábado, Fim de semana");
            case 7:
                System.out.println("Domingo, Fim de semana");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }

    // O mesmo exercicio mas agora com If

    /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Fala aq: ");
        int input = scanner.nextInt();

        if (input <= 4) {
            System.out.println("Dia de semana");
        } else if (input <= 6) {
            System.out.println("Fim de semana");
        } else {
            System.out.println("invalid!");
        }    */

    }
}



