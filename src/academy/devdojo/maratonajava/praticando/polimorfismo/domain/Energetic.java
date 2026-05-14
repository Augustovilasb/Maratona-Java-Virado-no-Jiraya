package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Energetic extends Drinks {

    public static final int ENERGETIC_BEST_BEFORE = 720;
    public static final int  ENERGETIC_STOCK_FULL = 150;

    public Energetic(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (ENERGETIC_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return ENERGETIC_STOCK_FULL - getQnttSold();
    }
}