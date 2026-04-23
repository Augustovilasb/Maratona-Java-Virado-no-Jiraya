package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.List;

public class Studio {

    private String name;
    private List<Game> gamesList;

    public Studio(String name, List<Game> gamesList) {
        this.name = name;
        this.gamesList = gamesList;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "gamesList=" + gamesList +
                ", name='" + name + '\'' +
                '}';
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
