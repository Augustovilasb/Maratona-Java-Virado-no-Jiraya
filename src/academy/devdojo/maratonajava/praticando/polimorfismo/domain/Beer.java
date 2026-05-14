package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Beer extends Drinks {

    public static final int BEER_BEST_BEFORE = 360;
    public static final int  BEER_STOCK_FULL = 400;

    public Beer(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (BEER_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return BEER_STOCK_FULL - getQnttSold();
    }
}
