package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kumbucha extends Drinks {

    public static final int KUMBUCHA_BEST_BEFORE = 90;
    public static final int  KUMBUCHA_STOCK_FULL = 80;

    public Kumbucha(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (KUMBUCHA_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return KUMBUCHA_STOCK_FULL - getQnttSold();
    }
}
