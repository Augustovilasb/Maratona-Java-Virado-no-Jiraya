package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Molodoy");
        Jogador jogador2 = new Jogador("m0NESY");
        Jogador jogador3 = new Jogador("Olofmeinster");
        Jogador jogador4 = new Jogador("S1mple");
        Jogador jogador5 = new Jogador("Flusha");
        Jogador jogador6 = new Jogador("Taco");
        Time time = new Time("Vitality");
        Time time2 = new Time("Faze");
        Time time3 = new Time("Sk");
        Time time4 = new Time("Virtus Pro");
        Time time5 = new Time("Luminosity");
        Time time6 = new Time("Immortals");

        Jogador[] jogadores = {jogador1,jogador2,jogador3,jogador4,jogador5,jogador6};
        time.setJogadores(jogadores);
        jogador1.setTime(time);
        jogador2.setTime(time2);
        jogador3.setTime(time3);
        jogador4.setTime(time4);
        jogador5.setTime(time5);
        jogador6.setTime(time6);

        System.out.println("-----Player1-----");
        jogador1.imprime();
        System.out.println("-----Player2-----");
        jogador2.imprime();
        System.out.println("-----Player3-----");
        jogador3.imprime();
        System.out.println("-----Player4-----");
        jogador4.imprime();
        System.out.println("-----Player5-----");
        jogador5.imprime();
        System.out.println("-----Player6-----");
        jogador6.imprime();
    }
}
