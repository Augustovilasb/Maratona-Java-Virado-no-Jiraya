package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

public class Game {

    private String name;
    private Studio studio;
    private TypeGames typeGames;

    public Game(String name, TypeGames typeGames, Studio studio) {
        this.name = name;
        this.typeGames = typeGames;
        this.studio = studio;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + " | " + this.getTypeGames().getType() + " | "  + this.getStudio());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeGames getTypeGames() {
        return typeGames;
    }

    public void setTypeGames(TypeGames typeGames) {
        this.typeGames = typeGames;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
