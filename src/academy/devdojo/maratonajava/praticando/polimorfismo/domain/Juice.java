package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Juice extends Drinks {

    public static final int JUICE_BEST_BEFORE = 360;
    public static final int  JUICE_STOCK_FULL = 200;

    public Juice(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (JUICE_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return JUICE_STOCK_FULL - getQnttSold();
    }
}
