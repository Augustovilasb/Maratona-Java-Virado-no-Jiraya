package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Calculadora;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("\n");
        System.out.println("Iniciando Soma");
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora");

        System.out.println("\n");
        System.out.println("Iniciando Subtração");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Calculadora");

        System.out.println("\n");
        System.out.println("Iniciando Multiplicação");
        calculadora.multiplicaDoisNumeros(92, 92, 1);
        System.out.println("Finalizando Calculadora");

    /*    System.out.println("\n");
        System.out.println("Dividindo 2 numeros");
        calculadora.divideDoisNumeros(3258647,10);
        System.out.println("Finalizando Calculadora");
*/

        System.out.println("\n");
        System.out.println("Dividindo 2 numeros");
        double result = calculadora.divideDoisNumeros(678,7);
        System.out.println(result);
        LocalDate date = LocalDate.now();
        System.out.println("Finalizando Calculadora, hoje no dia " + date);

        System.out.println("\n");
        calculadora.imprimeDivisaoDeDoisNumeros();
        System.out.println("Finalizando Calculadora, hoje no dia " + date);

    }
}