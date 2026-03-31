package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak05 {
    public static void main(String[] args) {

        // Cada garrafa custa R$7
        // O orçamento total é R$100
        // Ela precisa comprar pelo menos 5 garrafas
        // Ela quer comprar o máximo possível sem ultrapassar o orçamento

        // VARIAVEIS
        double precoGarrafa = 7;
        double orcamentoTotal = 100;
        int valorFinal = 0;
        double gastoTotalGarrafas = 0;

        // FORI SEMPRE COM ITEM PRINCIPAL DO EXERCICIO EX: Onibus, Cadeira, Garrafa...
        for (int qntGarrafa = 5; qntGarrafa >= 5; qntGarrafa++) {
            // primeiramente sempre calcular o que pede, gasto, curto, etc...
            double gastoTotal = (qntGarrafa * precoGarrafa);
            // Condicao imposta pelo exercicio...
            if (gastoTotal >= orcamentoTotal) {
                // break para o programa parar o loop assim que chegar na condicao
                break;
            }
            // recebendo valores das variaveis de dentro do IF para imprimir o resultado certo
            valorFinal = qntGarrafa;
            gastoTotalGarrafas = gastoTotal;
        }
            System.out.println("Voce conseguiu comprar " + valorFinal + " garrafas por um total de R$" + gastoTotalGarrafas);
    }
}
