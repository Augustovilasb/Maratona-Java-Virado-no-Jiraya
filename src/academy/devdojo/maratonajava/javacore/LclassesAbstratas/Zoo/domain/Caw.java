package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public class Caw extends Animal {

    public Caw(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Moo...Mooo...Moo...");
    }

    @Override
    public void whatIsTheHumanAge() {
        int humanAge = this.age * 10;
        System.out.println(humanAge);
    }
}
