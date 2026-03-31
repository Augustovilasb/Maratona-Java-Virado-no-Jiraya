package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak12 {
    public static void main(String[] args) {

        // Você vai comprar pizzas, refrigerantes e sobremesas.
        // Preços: pizza = R$30, refrigerante = R$5, sobremesa = R$12.
        // Orçamento: R$100.

        // Condições:
        // Comprar pelo menos 1 pizza.
        // Comprar pelo menos 2 refrigerantes.
        // Comprar o máximo possível de sobremesas,
        // mas sempre tentando colocar refrigerantes extras se sobrar dinheiro.
        // Nunca ultrapassar o orçamento.

        // Aqui o truque: em vez de comprar tudo de um item primeiro,
        // vamos usar dois loops aninhados para testar combinações diferentes
        // e ver qual maximiza a quantidade de sobremesas sem quebrar o orçamento,
        // mas ainda permitindo refrigerantes extras.

        double precoPizza = 30;
        double precoSobremesa = 12;
        double precoRefrigerante = 5;
        double orcamentoTotal = 100;

        primeiraOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);
        segundaOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);
        terceiraOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);

        Compra op1 = primeiraOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);
        Compra op2 = primeiraOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);
        Compra op3 = primeiraOpcao(precoPizza, precoRefrigerante, precoSobremesa, orcamentoTotal);


        Compra melhor = op1;
        String nomeMelhor = "Opção 1";

        if (op2.qntFinalSobremesa > melhor.qntFinalSobremesa || (op2.qntFinalSobremesa == melhor.qntFinalSobremesa && op2.qntFinalRefrigerante > melhor.qntFinalRefrigerante)) {
            melhor = op2;
            nomeMelhor = "Opção 2";
        }
        if (op3.qntFinalSobremesa > melhor.qntFinalSobremesa || (op3.qntFinalSobremesa == melhor.qntFinalSobremesa && op3.qntFinalRefrigerante > melhor.qntFinalRefrigerante)) {
            melhor = op3;
            nomeMelhor = "Opção 2";
        }

        //resultado
        System.out.println("Melhor combinação é a: " + nomeMelhor);
        System.out.println("Pizzas: " + melhor.qntFinalPizzas);
        System.out.println("Sobremesa: " + melhor.qntFinalSobremesa);
        System.out.println("Refrigerante: " + melhor.qntFinalRefrigerante);
        System.out.println("Total gasto: " + melhor.valorFinal);
        }

    static class Compra {
        int qntFinalPizzas;
        int qntFinalRefrigerante;
        int qntFinalSobremesa;
        double valorFinal;

        Compra(int qntFinalPizzas, int qntFinalRefrigerante, int qntFinalSobremesa, double valorFinal) {
            this.qntFinalPizzas = qntFinalPizzas;
            this.qntFinalRefrigerante = qntFinalRefrigerante;
            this.qntFinalSobremesa = qntFinalSobremesa;
            this.valorFinal = valorFinal;
        }
    }

    public static Compra primeiraOpcao(double precoPizza, double precoRefrigerante, double precoSobremesa, double orcamentoTotal) {

        int qntPizza = 1;
        int qntRefrigerante = 2;
        int qntSobremesa = 0;

        double valorTotal = qntPizza * precoPizza + qntRefrigerante * precoRefrigerante;

        for (qntSobremesa = 1; valorTotal + precoSobremesa <= orcamentoTotal; qntSobremesa++) {
            valorTotal += precoSobremesa;
        }

        double resto = orcamentoTotal - valorTotal;

        //System.out.println("Opcao 1:");
        //System.out.println("Aqui eu consegui comprar " + qntPizza + " Pizzas, " + qntRefrigerante + " Refris, e " + qntSobremesa + " Sobremesas");
        //System.out.println("Gastando um total de " + valorTotal + " e com um resto de " + resto);

        return new Compra(qntPizza, qntRefrigerante, qntSobremesa, valorTotal);
    }

    public static Compra segundaOpcao(double precoPizza, double precoRefrigerante, double precoSobremesa, double orcamentoTotal) {

        int qntPizza = 1;
        int qntRefrigerante = 2;
        int qntSobremesa = 0;

        double valorTotal = qntPizza * precoPizza + qntRefrigerante * precoRefrigerante;

        for (qntRefrigerante = 2; valorTotal + precoRefrigerante <= orcamentoTotal; qntRefrigerante++) {
            valorTotal += precoRefrigerante;
        }

        double resto = orcamentoTotal - valorTotal;

        //System.out.println("Opcao 1:");
        //System.out.println("Aqui eu consegui comprar " + qntPizza + " Pizzas, " + qntRefrigerante + " Refris, e " + qntSobremesa + " Sobremesas");
        //System.out.println("Gastando um total de " + valorTotal + " e com um resto de " + resto);

        return new Compra(qntPizza, qntRefrigerante, qntSobremesa, valorTotal);
    }

    public static Compra terceiraOpcao(double precoPizza, double precoRefrigerante, double precoSobremesa, double orcamentoTotal) {

        int qntPizza = 1;
        int qntRefrigerante = 2;
        int qntSobremesa = 0;

        double valorTotal = qntPizza * precoPizza + qntRefrigerante * precoRefrigerante;

        for (; valorTotal + precoPizza <= orcamentoTotal; qntPizza++) {
            valorTotal += precoPizza;
        }

        double resto = orcamentoTotal - valorTotal;

        //.out.println("Opcao 1:");
        //System.out.println("Aqui eu consegui comprar " + qntPizza + " Pizzas, " + qntRefrigerante + " Refris, e " + qntSobremesa + " Sobremesas");
        //System.out.println("Gastando um total de " + valorTotal + " e com um resto de " + resto);

        return new Compra(qntPizza, qntRefrigerante, qntSobremesa, valorTotal);

    }
}
