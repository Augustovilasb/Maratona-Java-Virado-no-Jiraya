package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        /* int idade = 18;
        boolean isAutorizedBuyDrink = idade >= 18;

        if (isAutorizedBuyDrink) {
            System.out.println("Qual bebida vai querer?");
        }  else {
            System.out.println("Volte daqui alguns anos");
        }

        if (!isAutorizedBuyDrink) {
            System.out.println("Volte years late!");
        } else {
            System.out.println("Wahtuwant?");
        } */

        int idade = 16;

        boolean isPlayerInfantil = idade < 15;
        boolean isPlayerJuvenil = idade > 15 && idade < 18;

        if (isPlayerInfantil) {
            System.out.println("Treino infantil as 8 da manha");
        } else if (isPlayerJuvenil) {
            System.out.println("Treino juvenil as 9 da manhã");
        } else {
            System.out.println("Treino juvenil as 10 da manhã");
        }
    }
}