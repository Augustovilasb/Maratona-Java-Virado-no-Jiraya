package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o sexo biológico: 'M' or 'H'");
        String sexo = scanner.next();

        switch (sexo) {
            case "M":
                System.out.println("Mulher");
                break;
                case "H":
                    System.out.println("Homem");
                    break;
                default:
                    System.out.println("AQUI NAP É A ESQUERDA, OU VOCE É HOMEM OU MULHER!");
                    break;
            }
        }
    }
