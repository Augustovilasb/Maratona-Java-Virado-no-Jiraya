package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak11 {
    public static void main(String[] args) {

        // Você vai comprar pizzas, refrigerantes e sobremesas.
        // Cada pizza custa R$30, cada refrigerante custa R$5, cada sobremesa custa R$12.
        // Seu orçamento total é R$100.
        // Você precisa comprar pelo menos 1 pizza e pelo menos 2 refrigerantes.
        // Você quer comprar o máximo possível de sobremesas sem ultrapassar o orçamento.
        // No final, imprima quanto sobrou do orçamento e a quantidade de cada item comprado.
        // Extra para dificultar:
        // Faça de forma que, se sobrar dinheiro, tente comprar mais refrigerantes antes das sobremesas, mas ainda priorizando as sobremesas depois.

        double precoPizza = 30;
        double precoSobremesa = 12;
        double precoRefri = 5;
        double orcamentoTotal = 100;
        int qntPizza = 1;
        int qntRefri = 2;
        int qntSobremesa = 0;

        double totalGasto = precoPizza * qntPizza + precoRefri * qntRefri;

        for (; totalGasto + precoSobremesa <= orcamentoTotal ; qntSobremesa++) {
            totalGasto += precoSobremesa;
        }

        for (; totalGasto + precoRefri <= orcamentoTotal ; qntRefri++) {
            totalGasto += precoRefri;
        }

        double  resto = orcamentoTotal - totalGasto;

        System.out.println("Com R$" + totalGasto + " eu consegui comprar " + qntPizza + " Pizza, " + qntRefri + " Refri " + qntSobremesa + " e Sobremesa... e ainda me sobrou R$ " + resto);
    }
}
