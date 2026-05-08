package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Sniff...Sniff...Sniff...");
    }

    @Override
    public void whatIsTheHumanAge() {
        int humanAge = this.age * 12;
        System.out.println(humanAge);
    }
}
