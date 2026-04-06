package academy.devdojo.maratonajava.praticando.associacao.campeonatodefutebol;

public class Time {

    private String nome;
    private String cidade;
    private Jogador[] jogadores;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Time(String nome, String cidade, Jogador[] jogadores) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
