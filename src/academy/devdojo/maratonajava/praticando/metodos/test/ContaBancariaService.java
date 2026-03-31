package academy.devdojo.maratonajava.praticando.metodos.test;


import academy.devdojo.maratonajava.praticando.metodos.dominio.BancoDomain;
import academy.devdojo.maratonajava.praticando.metodos.dominio.Saldo;

import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaService {

    public static void main(String[] args) {


        BancoDomain banco = new BancoDomain();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao BCSC");
        System.out.println("Posso ajudar? Digite sim ou não;");
        String input = scanner.next();

        ArrayList<Saldo> extratoList = new ArrayList<>();
        extratoList.add(new Saldo("depositar", 522));
        extratoList.add(new Saldo("saque", 87));

        banco.depositar(extratoList, scanner);

    }
}
