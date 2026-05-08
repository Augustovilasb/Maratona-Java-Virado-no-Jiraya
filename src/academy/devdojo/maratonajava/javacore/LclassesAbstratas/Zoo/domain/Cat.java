package academy.devdojo.maratonajava.javacore.LclassesAbstratas.Zoo.domain;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow...Meow...Meow...");
    }

    @Override
    public void whatIsTheHumanAge() {
        int humanAge;
        if (age < 5) {
            humanAge = this.age * 5;
        } else {
            humanAge = this.age * 4;
        }
        System.out.println(humanAge);
    }
    }
