package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak04 {
    public static void main(String[] args) {

        // No minimo 5 viagens no total, mas com pelo menos 1 viagem de Onbs Grande
        // Quantas viagens de cada tipo podem ser feitas?
        // Gasto total?
        // Valor que sobra do orçamento?

        double valorOnibusPequeno = 300;
        double valorOnibusGrande = 500;
        double orcamentoTotal = 5000;
        int qntViagemOnibusGrande = 1;
        int qntViagemOnibusPequeno = 0;

        double gastoTotal = qntViagemOnibusGrande * valorOnibusGrande + qntViagemOnibusPequeno * valorOnibusPequeno;

        for (qntViagemOnibusPequeno = 0; gastoTotal + valorOnibusPequeno <= orcamentoTotal; qntViagemOnibusPequeno++) {
        gastoTotal = qntViagemOnibusGrande * valorOnibusGrande + qntViagemOnibusPequeno * valorOnibusPequeno;

        }

        int totalViagens = qntViagemOnibusGrande + qntViagemOnibusPequeno;

        // Se a quantidade de viagens for menor que 5, adicionar mais onibus pequenos

        for (; totalViagens < 5 && gastoTotal + valorOnibusPequeno <= orcamentoTotal; qntViagemOnibusPequeno++) {
            gastoTotal = qntViagemOnibusGrande * valorOnibusGrande + qntViagemOnibusPequeno * valorOnibusPequeno;
            totalViagens = qntViagemOnibusGrande + qntViagemOnibusPequeno;
        }

        double sobraOrcamento = orcamentoTotal - gastoTotal;

        // Imprimindo resultados

        System.out.println("Quantidade total de viagens Onb Pequenos " + qntViagemOnibusPequeno);
        System.out.println("Quantidade total de viagens Onb Grandes " + qntViagemOnibusGrande);
        System.out.println("Quantidade total de viagens " + totalViagens);
        System.out.println("Esse foi o valor gasto " + gastoTotal);
        System.out.println("Isso sobrou do orçamento " + sobraOrcamento);

    }
}