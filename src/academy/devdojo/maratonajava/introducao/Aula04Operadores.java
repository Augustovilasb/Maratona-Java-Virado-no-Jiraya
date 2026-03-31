package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // +, -, *, /, ++, --, ==, !=, %

        int valor1 = 199;
        int valor2 = 145;
        double valor3 = 14;
        double valor4 = 14;

        //soma de dois valores int
        int resultado = valor1 + valor2;

        // para dividir um Int por Int o resultado vai ser sempre inteiro.
        // Para dividir um int por double, a variavel resultante tem que ser double.
        double resultado2 = (valor1 / valor3);

        //dividindo dois numeros int cm um resultante int
        int resultado3 = valor1 / valor2;

        //RESTO, é a resultante do resto de uma divisao
        //por exemplo, dividindo valor1 por valor3, vamos ter resto %
        // OBS, como o valor tem casas decimais, se for INT havera erro.
        double resto = valor1 % valor3;

        //o resto de um numero igual é igual a 0, portanto nao te resto
        double resto1 = valor3 % valor4;

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resto);
        System.out.println(resto1);

        //operadores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        boolean isDezDiferenteDeOnze = 10 != 11;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualDez "+ isDezIgualDez);
        System.out.println("isDezDiferenteDeDez "+ isDezDiferenteDeDez);
        System.out.println("isDezDiferenteDeOnze "+ isDezDiferenteDeOnze);


        // && AND, || OR
        int idade = 29;
        double salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        boolean isMaiorQueTrintaOuSalarioMenor = idade >= 30 || salario >= 4612;
        boolean isMenorQueTrintaOuSalarioMaior = idade < 30 || salario >= 3381;

        System.out.println("isMaiorQueTrintaOuSalarioMenor " +isMaiorQueTrintaOuSalarioMenor);
        System.out.println("isMenorQueTrintaOuSalarioMaior " +isMenorQueTrintaOuSalarioMaior);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 350;
        bonus /= 3;
        bonus *= 4;
        bonus %= 2;
        System.out.println(bonus);

        // contador ++, --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);
        //colocando o ++ ou o -- antes ou depois da variavel altera o valor de acordo com a ordem
        int contador2 = 0;
        System.out.println(contador2 ++);
        System.out.println(contador2);
        System.out.println(-- contador2);
    }
}
