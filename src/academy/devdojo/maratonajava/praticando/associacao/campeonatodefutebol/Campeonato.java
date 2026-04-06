package academy.devdojo.maratonajava.praticando.associacao.campeonatodefutebol;

public class Campeonato {

    private String nome;
    private int ano;
    private Time[] times;
    private Estadio estadio;

    public Campeonato(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public Campeonato(String nome, int ano, Estadio estadio, Time[] times) {
        this.nome = nome;
        this.ano = ano;
        this.estadio = estadio;
        this.times = times;
    }

    public void imprime() {
        System.out.println(" ");
        System.out.println("##########################################################");
        System.out.println("Campeonato: " + this.getNome());
        System.out.println("Ano: " + this.getAno());
        System.out.println("##########################################################");
        System.out.println("Local: " + estadio.getNome());
        System.out.println("Capacidade: " + estadio.getCapacidade() + " mil pessoas");
        System.out.println("##########################################################");
        System.out.println("Primeira partida entra o time AxB");
        System.out.println("Segunda partida entra o time CxD");
        System.out.println("E o vencedor de cada uma delas realizará a Final!");
        System.out.println("##########################################################");
        System.out.println("Regras: ");
        System.out.println("1) Cada time deve ter 6 jogadores");
        System.out.println("2) Entre eles, um deve ser Goleiro");
        System.out.println("3) Idade mínima, 16 anos");
        System.out.println("4) Chuteira com trava de plástico apenas");
        System.out.println("5) O jogo tem dois tempos, cada tempo de 25 minutos");
        System.out.println("##########################################################");
        System.out.println("PRIMEIRA PARTIDA: " + times[0].getNome() + " X " + times[1].getNome());
        System.out.println("SEGUNDA PARTIDA: " + times[2].getNome() + " X " + times[3].getNome());
        System.out.println("##########################################################");
        if (times == null) return;
        int contador = 1;
        for (Time time : times) {
            System.out.println("TIME " + contador + " : " + time.getNome());
            System.out.println("CIDADE: " + time.getCidade());
            for (Jogador jogador : time.getJogadores()) {
                System.out.println("  - " + jogador.getNome() + ". Posição: " + jogador.getPosicao());
            }
        System.out.println("##########################################################");
            contador++;
        }
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Time[] getTimes() {
        return times;
    }

    public void setTimes(Time[] times) {
        this.times = times;
    }
}
