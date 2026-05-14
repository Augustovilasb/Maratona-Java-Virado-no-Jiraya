package academy.devdojo.maratonajava.praticando.polimorfismo.service;

import academy.devdojo.maratonajava.praticando.polimorfismo.domain.Drinks;

public class DrinkReports {

    public static void drinkReports(Drinks drinks) {

        System.out.println("Type: " + drinks.getName());
        System.out.println("Quantity sold: " +  drinks.getQnttSold());
        System.out.println("Qty left in Stock: " + drinks.minimumStock());
        System.out.println("Days remaining before expiry? " + drinks.ifIsOutOfDate());
    }

}