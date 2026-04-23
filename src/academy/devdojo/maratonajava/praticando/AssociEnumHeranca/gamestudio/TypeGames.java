package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

public enum TypeGames {

    FPS(1, "First Person Shot"),
    RPG(2, "Role Playing Game"),
    RTS(3, "Real Time Strategy"),
    INDI(4, "Independent Game");

    private final int value;
    private final String type;

    TypeGames(int value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "TypeGames{" +
                "type='" + type + '\'' +
                ", value=" + value +
                "} " + super.toString();
    }

    public static TypeGames findGameByValue(int value) {
        for (TypeGames typeGames : values()) {
            if (typeGames.getValue() == value)
                return typeGames;
        }
        return null;
    }

    public static TypeGames findGameByType(String type) {
        for (TypeGames typeGames : values()) {
            if (typeGames.getType().equals(type))
                return typeGames;
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
