package academy.devdojo.maratonajava.praticando.metodos.dominio;

public class MatrizService {

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int EncontrarMaiorValor(int[][] matriz) {
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println(maior);
        return maior;
    }

    public int EncontrarQuantosNumerosPares(int[][] matriz) {
        int qntNumerosPares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    qntNumerosPares++;
                }
            }
        }
        System.out.println(qntNumerosPares);
        return qntNumerosPares;
    }

    public int EncontrarQuantosNumerosImpares(int[][] matriz) {
        int qntNumerosImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    qntNumerosImpares++;
                }
            }
        }
        System.out.println(qntNumerosImpares);
        return qntNumerosImpares;
    }

    public int SomarNumerosDaBorda(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz.length - 1) {
                    soma += matriz[i][j];
                    }
                }
            }
        System.out.println(soma);
        return soma;
        }
    }