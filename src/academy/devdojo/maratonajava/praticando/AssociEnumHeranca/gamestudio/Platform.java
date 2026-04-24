package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.List;

public class Platform {

    private String name;
    private List<Studio> studioList;
    private List<Player> playerList;

    public Platform(String name) {
        this.name = name;
    }

    public Platform(String name, List<Studio> studioList, List<Player> playerList) {
        this.name = name;
        this.studioList = studioList;
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "name=" + name +
                ", studioList=" + studioList +
                ", playerList=" + playerList +
                '}';
    }

    public void searchPlayerByGame(Game game) {
        if (playerList == null) return;
        for (Player player : playerList) {
            if (game.getName().equals(player.getGame().getName())) {
                System.out.println("The player name is: " + player.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Studio> getStudioList() {
        return studioList;
    }

    public void setStudioList(List<Studio> studioList) {
        this.studioList = studioList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
