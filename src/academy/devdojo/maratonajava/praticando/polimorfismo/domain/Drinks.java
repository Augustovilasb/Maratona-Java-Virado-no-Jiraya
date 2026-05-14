package academy.devdojo.maratonajava.praticando.polimorfismo.domain;

import java.time.LocalDate;

public abstract class Drinks implements DrinkReport {

    protected String name;
    protected int qnttSold;
    protected LocalDate manufacturingDate;

    public Drinks(String name, int qnttSold, LocalDate manufacturingDate) {
        this.name = name;
        this.qnttSold = qnttSold;
        this.manufacturingDate = manufacturingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQnttSold() {
        return qnttSold;
    }

    public void setQnttSold(int qnttSold) {
        this.qnttSold = qnttSold;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
}
