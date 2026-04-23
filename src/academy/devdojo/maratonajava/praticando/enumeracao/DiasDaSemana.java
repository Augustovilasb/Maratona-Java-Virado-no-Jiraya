package academy.devdojo.maratonajava.praticando.enumeracao;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana desejado, do 1 ao 7: ");
        int valorDia = sc.nextInt();

        String diaSemana = Semana.BuscaDiasDaSemana(valorDia).getNome();
        System.out.println(diaSemana);
    }
}
