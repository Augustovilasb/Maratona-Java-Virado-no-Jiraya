package academy.devdojo.maratonajava.introducao;

import javax.swing.plaf.IconUIResource;

public class Aula06EstruturasDeRepeticao02 {

    public static void main(String[] args) {

        // imprimir todos os numeros pares até 1000000

        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /* for (int i = 0; i < 1000; i += 2) {
            System.out.println(i);
        } */

        // imprimir todos os numeros impares até 1000000

        /* for (int i = 1; i < 1000000; i += 2) {
            System.out.println(i);
        } */

        /* int numero = 0;
        while (numero <= 100) {
            System.out.println(numero);
            numero += 2;
        } */

        /* double numero = 1;
        while (numero >= 0.000002) {
            System.out.println(numero);
            numero /= 2;
        } */

    }
}