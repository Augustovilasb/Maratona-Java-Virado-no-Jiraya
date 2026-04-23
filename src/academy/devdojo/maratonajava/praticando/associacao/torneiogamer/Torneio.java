package academy.devdojo.maratonajava.praticando.associacao.torneiogamer;

import java.util.ArrayList;
import java.util.List;

public class Torneio {

    private String name;
    private String game;
    private Organizador organizador;
    private List<Time> timeList;

    public Torneio(String name, String game, Organizador organizador) {
        this.name = name;
        this.game = game;
        this.organizador = organizador;
        this.timeList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------ TORNEIO " + this.name + "------\n");
        sb.append("------ GAME " + this.game + "------\n");
        sb.append("------ ORGANIZED BY " + organizador.getName() + "------\n");
        sb.append("------ FROM " + organizador.getOrganizadorPaisOrigem() + "------\n");
        sb.append("-------- TIMES ---------\n");
        for (Time time : timeList) {
            sb.append(time.toString());
        }
        return sb.toString();
    }

    public void qualTorneioJogadorEsta(Jogador jogador) {
        if (timeList == null) return;
        for (Time time : timeList) {
            for (Jogador jogadorNome : time.getJogadorList()) {
                if (jogadorNome.equals(jogador)) {
                    System.out.println("O torneio do jogador " + jogador.getName() + " é: " + getName());
                }
            }
        }
    }

        public String getName() {
            return name;
        }

    public void setName (String name){
            this.name = name;
        }

        public String getGame () {
            return game;
        }

        public void setGame (String game){
            this.game = game;
        }

        public Organizador getOrganizador () {
            return organizador;
        }

        public void setOrganizador (Organizador organizador){
            this.organizador = organizador;
        }

        public List<Time> getTimeList () {
            return timeList;
        }

        public void setTimeList (List < Time > timeList) {
            this.timeList = timeList;

        }
}