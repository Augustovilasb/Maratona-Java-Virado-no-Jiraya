package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.List;

public class Platform {

    private String name;
    private List<Studio> studioList;
    private List<Player> playerList;
    private List<Game> gamesList;

    public Platform(String name, List<Studio> studioList, List<Player> playerList, List<Game> gamesList) {
        this.name = name;
        this.studioList = studioList;
        this.playerList = playerList;
        this.gamesList = gamesList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n");
        sb.append("-------------------- GAME PLATFORM ---------------------\n");
        sb.append(this.name + "\n");
        sb.append("--------------------------------------------------------\n");
        sb.append("------------------- STUDIOS PRESENT --------------------\n");
        for (Studio studios : studioList) {
            sb.append(studios.toString() + "\n");
        }
        sb.append("--------------------------------------------------------\n");
        sb.append("------------------- GAMES DEVELOPED --------------------\n");
        for (Game games : gamesList) {
            sb.append(games.toString() + "\n");
        }
        sb.append("--------------------------------------------------------\n");
        sb.append("-------------------- PLAYERS ONLINE --------------------\n");
        for (Player players : playerList) {
            sb.append(players + "\n");
        }
        sb.append("--------------------------------------------------------\n");
        sb.append("--------------------------------------------------------\n");
        return sb.toString();
    }

    public void searchPlayerByGame(Game game) {
        if (playerList == null) return;
        for (Player player : playerList) {
            if (game.getName().equals(player.getGame().getName())) {
                System.out.println("Playing now: " + player.getName());
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

    public List<Game> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<Game> gamesList) {
        this.gamesList = gamesList;
    }
}
