package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

public class Jogador {

    private String name;
    private String nickname;
    private String jogadorPaisDeOrigem;

    public Jogador(String name, String nickname, String jogadorPaisDeOrigem) {
        this.name = name;
        this.nickname = nickname;
        this.jogadorPaisDeOrigem = jogadorPaisDeOrigem;
    }

    @Override
    public String toString() {
        return "Jogador name: " + this.getName() + ", Pais de origem: " + this.getJogadorPaisDeOrigem() + ", Nickname: " + this.getNickname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJogadorPaisDeOrigem() {
        return jogadorPaisDeOrigem;
    }

    public void setJogadorPaisDeOrigem(String jogadorPaisDeOrigem) {
        this.jogadorPaisDeOrigem = jogadorPaisDeOrigem;
    }
}
