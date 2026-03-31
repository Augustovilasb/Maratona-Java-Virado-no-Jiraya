package academy.devdojo.maratonajava.praticando.loops;

public class PraticandoLooPBreak06 {
    public static void main(String[] args) {

        // Uma pessoa quer comprar cadernos e canetas para a escola
        // Condicao
        // Comprar pelo menos 1 caderno e o máximo de caneta que der

        // Variaveis
        double valorCaderno = 15;
        double valorCaneta = 3;
        double orcamentoTotal = 50;
        int qntCaderno = 1;
        // Variaveis para impressao
        int canetasCompradas = 0;
        double valorTotalGasto = 0;
        double valorRestante = 0;

        for (int qntCaneta = 0; (qntCaneta * valorCaneta + qntCaderno * valorCaderno) <= orcamentoTotal; qntCaneta++) {
            canetasCompradas = qntCaneta;
            valorTotalGasto = qntCaneta * valorCaneta + qntCaderno * valorCaderno;
            valorRestante = orcamentoTotal - valorTotalGasto;
        }
        System.out.println("Gatando um valor de R$" + valorTotalGasto);
        System.out.println("Conseguimos comprar um total de " + qntCaderno + " caderno");
        System.out.println("Conseguimos comprar um total de " + canetasCompradas + " canetas");
        System.out.println("E ainda tivemos um resto de R$" + valorRestante);
    }
}