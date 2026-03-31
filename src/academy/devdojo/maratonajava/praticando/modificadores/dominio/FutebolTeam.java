package academy.devdojo.maratonajava.praticando.modificadores.dominio;

import java.util.Arrays;

public class FutebolTeam {

    private String nome;
    private String[] jogadores;
    private int titulos;
    private static int maxJogadores;

    public FutebolTeam(String nome, String[] jogadores) {
        this.nome = nome;
        if (jogadores.length > FutebolTeam.maxJogadores) {
            System.out.println("Time desclassificado! Mais de " + FutebolTeam.maxJogadores + " jogadores!");
            return;
        }
        this.jogadores = jogadores;
    }

    public FutebolTeam(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        if (jogadores != null) {
            for (String jogador: jogadores) {
                sb.append("Jogador: ").append(jogador).append("\n");
            }
        }
        sb.append("Títulos: ").append(titulos).append("\n");
        sb.append("Máximo de jogadores: ").append(maxJogadores);
        return sb.toString();
    }

    public void setJogadores(String[] jogadores) {
        if (jogadores.length > FutebolTeam.maxJogadores) {
            System.out.println("Time desclassificado! Motivo: Inscrição excessiva de jogadores!");
            System.out.println("Um time não pode ter mais do que " + FutebolTeam.maxJogadores);
            return;
        }
        this.jogadores = jogadores;
    }

    public String[] getJogadores() {return jogadores;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getTitulos() {return titulos;}
    public void setTitulos(int titulos) {this.titulos = titulos;}
    public static void setMaxJogadores(int maxJogadores) {FutebolTeam.maxJogadores = maxJogadores;}
}
