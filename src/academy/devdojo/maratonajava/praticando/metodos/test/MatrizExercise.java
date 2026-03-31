package academy.devdojo.maratonajava.praticando.metodos.test;

import academy.devdojo.maratonajava.praticando.metodos.dominio.MatrizService;

public class MatrizExercise {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        matriz[0][0] = 4;
        matriz[0][1] = 54;
        matriz[0][2] = 10;
        matriz[0][3] = 87;
        matriz[0][4] = 4;

        matriz[1][0] = 54;
        matriz[1][1] = 87;
        matriz[1][2] = 48;
        matriz[1][3] = 42;
        matriz[1][4] = 75;

        matriz[2][0] = 54;
        matriz[2][1] = 54;
        matriz[2][2] = 4;
        matriz[2][3] = 78;
        matriz[2][4] = 54;

        matriz[3][0] = 13;
        matriz[3][1] = 6;
        matriz[3][2] = 7;
        matriz[3][3] = 87;
        matriz[3][4] = 85;

        matriz[4][0] = 76;
        matriz[4][1] = 24;
        matriz[4][2] = 46;
        matriz[4][3] = 7;
        matriz[4][4] = 98;

        System.out.println("\n");
        System.out.println("Imprimindo toda matriz:");
        MatrizService impressora = new MatrizService();
        impressora.imprimirMatriz(matriz);

        System.out.println("\n");
        System.out.println("Encontrando o maior número:");
        MatrizService encontrar = new MatrizService();
        encontrar.EncontrarMaiorValor(matriz);

        System.out.println("\n");
        System.out.println("Contando quantos números pares a Matriz tem: ");
        MatrizService contar = new MatrizService();
        contar.EncontrarQuantosNumerosPares(matriz);

        System.out.println("\n");
        System.out.println("Contando quantos números impares a Matriz tem: ");
        MatrizService verificar = new MatrizService();
        verificar.EncontrarQuantosNumerosImpares(matriz);

        System.out.println("\n");
        System.out.println("Somando todos os elementos da borda da Matriz: ");
        MatrizService soma = new MatrizService();
        soma.SomarNumerosDaBorda(matriz);

    }
}