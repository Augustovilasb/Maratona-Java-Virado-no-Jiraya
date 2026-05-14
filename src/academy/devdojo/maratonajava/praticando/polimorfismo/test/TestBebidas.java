package academy.devdojo.maratonajava.praticando.polimorfismo.test;

import academy.devdojo.maratonajava.praticando.polimorfismo.domain.*;
import academy.devdojo.maratonajava.praticando.polimorfismo.service.DrinkReports;

import java.time.LocalDate;

public class TestBebidas {
    public static void main(String[] args) {

        Beer beer = new Beer("Heineken", 305, LocalDate.of(2026, 4, 25));
        Coffee coffee = new Coffee("Coffee Latte", 98, LocalDate.of(2026, 1, 15));
        Energetic energetic = new Energetic("Redbull", 105, LocalDate.of(2026, 2, 3));
        Juice juice = new Juice("Orange Juice", 56, LocalDate.of(2026, 3, 22));
        Kumbucha kumbucha = new Kumbucha("Stranberry Kumbucha", 13, LocalDate.of(2026, 4, 10));
        Milk milk = new Milk("OAT Milk", 44, LocalDate.of(2026, 5, 1));
        Soda soda = new Soda("Coca-Cola", 154, LocalDate.of(2026, 6, 18));
        Tea tea = new Tea("Matcha Tea", 44, LocalDate.of(2026, 7, 7));
        Water water = new Water("Sparkling Water", 240, LocalDate.of(2026, 8, 25));
        Wine wine = new Wine("Tinto Wine", 76, LocalDate.of(2026, 9, 14));

        System.out.println("---------------------------");
        System.out.println("DRINKS MONTHLY STOCK REPORT");
        System.out.println("---------------------------");
        DrinkReports.drinkReports(beer);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(coffee);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(water);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(wine);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(kumbucha);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(energetic);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(juice);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(milk);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(tea);
        System.out.println("---------------------------");
        DrinkReports.drinkReports(soda);
        System.out.println("---------------------------");

    }
}