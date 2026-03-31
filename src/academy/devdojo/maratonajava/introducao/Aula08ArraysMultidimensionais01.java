package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // criar um array para meses
        // e mais um array para os dias

        int[][] mesesDias = new int[12][31];

        for (int i = 0; i < mesesDias.length; i++) {
            for (int j = 0; j < mesesDias[i].length; j++) {
                mesesDias[i][j] = j + 1;
            }
        }

        for (int i = 0; i < mesesDias.length; i++) {
            for (int j = 0; j < mesesDias[i].length; j++) {
                System.out.println(mesesDias[i][j]);
            }
            System.out.println();
        }
    }
}