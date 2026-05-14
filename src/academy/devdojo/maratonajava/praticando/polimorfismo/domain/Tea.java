package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tea extends Drinks {

    public static final int TEA_BEST_BEFORE = 720;
    public static final int  TEA_STOCK_FULL = 150;

    public Tea(String name, int qnttSold, LocalDate manufacturingDate) {
        super(name, qnttSold, manufacturingDate);
    }

    @Override
    public int ifIsOutOfDate() {
        int daysElapsed = Math.toIntExact(ChronoUnit.DAYS.between(manufacturingDate, LocalDate.now()));
        return (TEA_BEST_BEFORE - daysElapsed);
    }

    @Override
    public double minimumStock() {
        return TEA_STOCK_FULL  - getQnttSold();
    }
}