package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        // Imprimir o dia da semana considerando um dia como Domingo
        // ESSA VARIAVEL DEFINE QUANDO O SWITCH VAI COMECAR A LER AS CONDIÇOES
        // byte dia = 4;

        // Valores que podemos utilizar no SWITCH
        // char, int, byte, short, enum, String

        for (byte i =1; i <= 7 ; i++) {
        switch (i) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
        }
    }
}

        /* if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } */
