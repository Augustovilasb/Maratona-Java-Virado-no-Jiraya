package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark...Bark...Bark...");
    }

    @Override
    public void whatIsTheHumanAge() {
        int humanAge = this.age * 7;
        System.out.println(humanAge);
    }
}
