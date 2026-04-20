package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String name;
    private Tecnico tecnico;
    private List<Jogador> jogadorList;

    public Time(String name, Tecnico tecnico) {
        this.name = name;
        this.tecnico = tecnico;
        this.jogadorList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team name: " + this.name + "\n");
        sb.append("Técnico: " + tecnico.getName() + " - " + tecnico.getNacionalidade() + "\n");
        for (Jogador jogador : jogadorList) {
            sb.append(" - " + jogador.getName() + " " + jogador.getNickname() + " - " + jogador.getJogadorPaisDeOrigem() + "\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadorList() {
        return jogadorList;
    }

    public void setJogadorList(List<Jogador> jogadorList) {
        this.jogadorList = jogadorList;
    }
}
