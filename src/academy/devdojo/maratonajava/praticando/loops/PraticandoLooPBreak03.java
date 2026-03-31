package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak03 {
    public static void main(String[] args) {

        double orcamentoTotal = 2000;
        double valorCaixa = 120;
        int caixasFinais = 0;
        double totalGasto = 0;
        double resto = 0;

        for (int qntMinima = 5; qntMinima > 0; qntMinima++) {
            double valorGasto = qntMinima * valorCaixa;
            if (valorGasto > orcamentoTotal) {
                break;
            }
            caixasFinais = qntMinima;
            totalGasto = valorGasto;
            resto = orcamentoTotal - valorGasto;
        }
            System.out.println("Você gastou um total de " + totalGasto);
            System.out.println("Levando pra casa uma quantidade de " + caixasFinais + " de caixas");
            System.out.println("E ainda sobrou um valor de R$" + resto);
    }
}