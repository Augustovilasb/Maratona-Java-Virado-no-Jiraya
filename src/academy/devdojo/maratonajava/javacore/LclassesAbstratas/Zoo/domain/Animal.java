package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeNoise();
    public abstract void whatIsTheHumanAge();
}
