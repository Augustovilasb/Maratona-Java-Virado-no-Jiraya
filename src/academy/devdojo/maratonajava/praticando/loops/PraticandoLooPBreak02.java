package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak02 {
    public static void main(String[] args) {

        double valorIngresso = 50;

        for (int qntIngresso = 1; qntIngresso > 0; qntIngresso++) {
            double valorTotal = qntIngresso * valorIngresso;
            if (valorTotal > 300) {
                break;
            }
            System.out.println("Você comprou um total de " + qntIngresso + " Você atingiu seu teto de R$" + valorTotal);
        }
        System.out.println("fora do for");
    }
}







