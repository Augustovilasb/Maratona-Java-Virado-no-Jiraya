package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] nomeLista2 = {31,894,51,369,17,74,174};

        for (int i = 0; i < nomeLista2.length; i++) {
            System.out.println(nomeLista2[i]);
        }
        for (int i : nomeLista2) {
            System.out.println(i);
        }

    }

}