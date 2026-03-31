package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais03 {
    public static void main(String[] args) {

        int[][] novaLista = new int[4][];
//janero
        novaLista[0] = new int[] {2,4};
        novaLista[1] = new int[] {5,4,3,7,4,8};
        novaLista[2] = new int[] {2,8,8,1,2,1,12,1};
        novaLista[3] = new int[] {2,4,14};

        int[][] novaLista2 = {{9,6,8},{15,48,1,7,1,2},{2,3},{1,3,5,6,7,5}};

        for (int[] listaA : novaLista2) {
                System.out.println("\n-----");
            for (int listaB : listaA) {
                System.out.println(listaB + " ");
            }
                System.out.println("\n-----");
        }
    }
}
