package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

public enum TypeGames {

    FPS(1, "FPS"),
    RPG(2, "RPG"),
    RTS(3, "RTS"),
    INDI(4, "INDI");

    private final int value;
    private final String type;

    TypeGames(int value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + this.getType() + " | Value: " + this.getValue());
        return sb.toString();
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
