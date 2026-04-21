package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    private String name;
    private List<Torneio> torneioList;

    public Plataforma(String name) {
        this.name = name;
        this.torneioList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plataforma: ").append(name).append("\n");
        for (Torneio torneio : torneioList) {
            sb.append(torneio.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Torneio> getTorneioList() {
        return torneioList;
    }

    public void setTorneioList(List<Torneio> torneioList) {
        this.torneioList = torneioList;
    }
}
