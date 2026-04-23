package academy.devdojo.maratonajava.praticando.AssociEnumHeranca.gamestudio;

import java.util.List;

public class StudioAAA extends Studio {

    private double budget;

    public StudioAAA(String name, List<Game> gamesList, double budget) {
        super(name, gamesList);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "StudioAAA{" +
                "budget=" + budget +
                "} " + super.toString();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
