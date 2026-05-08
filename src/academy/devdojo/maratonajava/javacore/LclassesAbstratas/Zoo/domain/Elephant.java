package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Trumpet...Trumpet...Trumpet...");
    }

    @Override
    public void whatIsTheHumanAge() {
        int humanAge = this.age * 3;
        System.out.println(humanAge);
    }
}