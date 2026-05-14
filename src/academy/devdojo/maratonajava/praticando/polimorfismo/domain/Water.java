package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Water extends Drinks {

    public static final int WATER_BEST_BEFORE = 360;
    public static final int  WATER_STOCK_FULL = 500;

    public Water(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (WATER_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return WATER_STOCK_FULL - getQnttSold();
    }
}
