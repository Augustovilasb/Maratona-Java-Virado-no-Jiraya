package academy.devdojo.maratonajava.introducao;

        // TABELA VERDADE
        // V && V = V
        // V && F = F
        // F && V = F
        // F && F = F
        // V && V && V && V && F = F
        // V || V = V
        // V || F = V
        // F || V = V
        // F || F = F
        // V || V || V || V || F = V
        // F || F || F || F || V = V

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

        // imposto por salário
        double taxa1 = 9.70/100;
        double taxa2 = 37.35/100;
        double taxa3 = 49.50/100;
        // limite salárial
        double limite1 = 0;
        double limite2 = 34712;
        double limite3 = 68507;

        // Scanner recebendo entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario anual:");
        double salario = scanner.nextDouble();

        // Calculo da aliquota por usuário
        double calculoTax1 = salario*taxa1;
        double calculoTax2 = salario*taxa2;
        double calculoTax3 = salario*taxa3;

        //Condição determinante para definir o imposto sobre salário
        if (limite1 < salario && salario <= limite2) {
            System.out.println("Seu salário bruto é de: " + (salario - calculoTax1) + " Com uma aliquota de " + taxa1 + ". pagando um total de " + calculoTax1 + " de imposto");
        } else if (limite2 < salario && salario <= limite3) {
            System.out.println("Seu salário bruto é de: " + (salario - calculoTax2) + " Com uma aliquota de " + taxa2 + ". pagando um total de " + calculoTax2 + " de imposto");
        } else {
            System.out.println("Seu salário bruto é de: " + (salario - calculoTax3) + " Com uma aliquota de " + taxa3 + ". pagando um total de " + calculoTax3 + " de imposto");
            }
        }
    }
