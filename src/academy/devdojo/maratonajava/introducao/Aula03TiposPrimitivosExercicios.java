package academy.devdojo.maratonajava.introducao;

// Eu <nome>, morando no endereço <endereço>,
// confirmo que recebi o salário de <salario>, na data <data> //

import java.util.Date;

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String name = "Augusto";
        String endereco = "Flat 7, 58 Rathmines Road Upper, Rathmines, Dublin 6";
        double salario = 1650.00;
        String data = "05/09/1992";
        String confirmacao = "Eu " + name + ", morando no " + endereco + "\n" +
                "confirmo que recebi o salário de " + salario + " Reais, na data de " + data + ".";

        System.out.println("");
        System.out.println("Eu " + name + ", morando no " + endereco + "\n" +
                "confirmo que recebi o salário de " + salario + " Reais, na data de " + data + ".");
        System.out.println("");
        System.out.println(confirmacao);
        System.out.println("");
    }
}
