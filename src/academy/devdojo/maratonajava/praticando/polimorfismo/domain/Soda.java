package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Soda extends Drinks {

    public static final int SODA_BEST_BEFORE = 360;
    public static final int SODA_STOCK_FULL = 200;

    public Soda(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (SODA_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return SODA_STOCK_FULL  - getQnttSold();
    }
}
