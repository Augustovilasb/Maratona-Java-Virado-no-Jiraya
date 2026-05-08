package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain.*;

public class Zoo {
    public static void main(String[] args) {

        System.out.println("Welcome to the CrazzyZoo!!!");

        Dog sheik = new Dog("Sheik", 4);
        Cat robertinho = new Cat("Robertinho", 11);
        Rabbit jose = new Rabbit("Jose", 3);
        Caw sabrina = new Caw("Sabrina", 5);
        Elephant tatu = new Elephant("Tatu", 6);

        sheik.makeNoise();
        sheik.whatIsTheHumanAge();

        robertinho.makeNoise();
        robertinho.whatIsTheHumanAge();

        jose.makeNoise();
        jose.whatIsTheHumanAge();

        sabrina.makeNoise();
        sabrina.whatIsTheHumanAge();

        tatu.makeNoise();
        tatu.whatIsTheHumanAge();
    }
}
