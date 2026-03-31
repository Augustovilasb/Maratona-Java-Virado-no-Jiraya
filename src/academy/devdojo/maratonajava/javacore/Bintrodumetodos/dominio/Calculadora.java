package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

import java.util.Scanner;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(100 + 100);
    }

    public void subtraiDoisNumeros() {
        System.out.println(50 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2, int num3) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Invalid input, make sure its diferent than zero.");
            return 0;
        }
        //System.out.println(num1/num2);
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input number 2: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Invalid second number, we cant divide by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("\n");
        System.out.println("Dentro do Altera 2 números");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}





