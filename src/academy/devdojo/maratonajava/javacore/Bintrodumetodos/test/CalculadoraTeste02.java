package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Calculadora;

import java.time.LocalDate;

public class CalculadoraTeste02 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(500, 20);

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
    }
}
