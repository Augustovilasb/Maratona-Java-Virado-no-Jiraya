package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak08 {
    public static void main(String[] args) {

        // Maçãs custam R$5 cada
        // Bananas custam R$3 cada
        // Laranjas custam R$4 cada
        // O orçamento total é R$50
        // Ela precisa comprar pelo menos 3 maçãs
        // Quer comprar o máximo de bananas e laranjas sem ultrapassar o orçamento

        double precoMaca = 5;
        double precoBanana = 3;
        double precoLaranja = 4;
        double orcamentoTotal = 50;
        int qntMaca = 3;
        int qntBanana = 0;
        int qntLaranja = 0;

        double totalGasto = precoMaca * qntMaca;

        while (totalGasto + precoBanana <= orcamentoTotal) {
            totalGasto += precoBanana;
            qntBanana++;
        }

        while (totalGasto + precoLaranja <= orcamentoTotal) {
            totalGasto += precoLaranja;
            qntLaranja++;
        }

        double resto = orcamentoTotal - totalGasto;
        System.out.println("Com R$" + totalGasto + " eu consegui comprar " + qntBanana + " Bananas, " + qntMaca + " Maças " + qntLaranja + " e Laranjas... e ainda me sobrou R$ " + resto);
    }
}
