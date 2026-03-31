package academy.devdojo.maratonajava.praticando.metodos.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoDomain {

    public void depositar(ArrayList<Saldo> extratoList, Scanner scanner) {

        String continuar = "Sim";

        while (continuar.equalsIgnoreCase("Sim")) {
            System.out.println("Deseja depositar ou sacar?");
            String tipo = scanner.next();
            if (!continuar.equalsIgnoreCase("Sim") && !continuar.equalsIgnoreCase("Nao")) {
                System.out.println("Input inválido! Digite Sim ou Nao");
            }

            if (tipo.equalsIgnoreCase("Depositar")) {
                System.out.println("Qual o valor?");
                double deposito = scanner.nextDouble();
                extratoList.add(new Saldo(tipo, deposito));
                System.out.println("Deposito realizado com sucesso!");

            } else if (tipo.equalsIgnoreCase("Sacar")) {
                System.out.println("Qual o valor?");
                double saque = scanner.nextDouble();
                extratoList.add(new Saldo(tipo, saque));
                System.out.println("Saque realizado com sucesso!");

            } else {
                System.out.println("Obrigado por ser cliente Banco BCSC");
                break;
            }

            // calcula saldo sempre depois de qualquer operacao
            double saldo = 0;
            for (int i = 0; i < extratoList.size(); i++) {
                if (extratoList.get(i).tipo.equalsIgnoreCase("Depositar")) {
                    saldo += extratoList.get(i).valor;
                } else {
                    saldo -= extratoList.get(i).valor;
                }
            }
            System.out.println("Seu saldo atual é: R$ " + saldo);
            System.out.println("Deseja realizar mais alguma operação?");
            continuar = scanner.next();
        }
    }
}
