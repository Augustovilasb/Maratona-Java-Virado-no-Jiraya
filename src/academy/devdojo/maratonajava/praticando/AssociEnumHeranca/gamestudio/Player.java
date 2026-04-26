package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

public class Player {

    private String name;
    private Game game;

    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
