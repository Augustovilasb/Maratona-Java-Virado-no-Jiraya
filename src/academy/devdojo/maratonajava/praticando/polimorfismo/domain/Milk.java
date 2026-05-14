package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Milk extends Drinks {

    public static final int MILK_BEST_BEFORE = 182;
    public static final int  MILK_STOCK_FULL = 200;

    public Milk(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (MILK_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return MILK_STOCK_FULL - getQnttSold();
    }
}
