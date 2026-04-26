package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.Iterator;
import java.util.List;

public class Studio {

    private String name;
    private List<Game> gamesList;
    private List<Studio> studioList;

    public Studio(String name, List<Game> gamesList) {
        this.name = name;
        this.gamesList = gamesList;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(" ------ STUDIOS ------ ");
    sb.append(this.name);
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<Game> gamesList) {
        this.gamesList = gamesList;
    }
}
