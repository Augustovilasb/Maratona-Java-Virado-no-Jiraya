package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String name;
    // Constant FINAL never can be changed.
    public static final double MAX_SPEED = 250;
    public final double MIN_SPEED = 150;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
