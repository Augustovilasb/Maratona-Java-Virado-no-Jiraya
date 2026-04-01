package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Como posso te ajudar?");
        String inputQuestion = entrada.nextLine();
        System.out.println("Qual seu nome?");
        String inputName = entrada.nextLine();
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Qual seu sexo?");
        char sexo = entrada.next().charAt(0);
        System.out.println("--------------------------");
        System.out.println("Reason: " + inputQuestion);
        System.out.println("Name: " + inputName);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);

    }
}