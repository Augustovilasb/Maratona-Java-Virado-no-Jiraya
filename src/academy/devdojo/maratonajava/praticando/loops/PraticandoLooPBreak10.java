package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak10 {
    public static void main(String[] args) {

        // Você quer comprar chocolates, balas e biscoitos.
        // Cada chocolate custa R$10, cada bala R$2, cada biscoito R$5.
        // Você tem um orçamento de R$50.
        // Você precisa comprar pelo menos 2 chocolates.
        // Depois, quer comprar o máximo possível de balas e biscoitos, sem passar do orçamento.

        double orcamentoTotal = 50;
        double precoChocolate = 10;
        double precoBala = 2;
        double precoBiscoitos = 5;
        int qntChocolate = 2;
        int qntBala = 0;
        int qntBiscoitos = 0;

        double totalGasto = qntChocolate * precoChocolate;

        for (qntBiscoitos = 0; totalGasto + precoBiscoitos <= orcamentoTotal ; qntBiscoitos++) {
            totalGasto += precoBiscoitos;
        }

        for (qntBala = 0; totalGasto + precoBala <= orcamentoTotal ; qntBala++) {
            totalGasto += precoBala;
        }

        double resto = orcamentoTotal - totalGasto;

        System.out.println("Com R$" + totalGasto + " eu consegui comprar " + qntChocolate + " Chocolate, " + qntBiscoitos + " Biscoitos " + qntBala + " e Balas... e ainda me sobrou R$ " + resto);

    }
}
