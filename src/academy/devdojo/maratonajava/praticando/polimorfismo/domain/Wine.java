package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Wine extends Drinks {

    public static final int WINE_BEST_BEFORE = 720;
    public static final int  WINE_STOCK_FULL = 100;

    public Wine(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (WINE_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return WINE_STOCK_FULL - getQnttSold();
    }
}
