package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak09 {
    public static void main(String[] args) {

        double precoMaca = 5;
        double precoBanana = 3;
        double precoLaranja = 4;
        double orcamentoTotal = 50;
        int qntMaca = 3;
        int qntBanana = 0;
        int qntLaranja = 0;

        double totalGasto = precoMaca * qntMaca;

        for (qntBanana = 0; totalGasto + precoBanana <= orcamentoTotal ; qntBanana++) {
            totalGasto += precoBanana;
        }

        for (qntLaranja = 0; totalGasto + precoLaranja <= orcamentoTotal ; qntLaranja++) {
            totalGasto += precoLaranja;
        }

        double resto = orcamentoTotal - totalGasto;
        System.out.println("Com R$" + totalGasto + " eu consegui comprar " + qntBanana + " Bananas, " + qntMaca + " Maças " + qntLaranja + " e Laranjas... e ainda me sobrou R$ " + resto);
    }
}