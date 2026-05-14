package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coffee extends Drinks {

    public static final int COFFEE_BEST_BEFORE = 360;
    public static final int  COFFEE_STOCK_FULL = 250;

    public Coffee(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (COFFEE_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return COFFEE_STOCK_FULL - getQnttSold();
    }
}
