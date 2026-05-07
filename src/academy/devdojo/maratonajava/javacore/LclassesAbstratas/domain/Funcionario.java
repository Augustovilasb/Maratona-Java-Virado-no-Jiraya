package academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain;

public abstract class Funcionario extends Person {

    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculationSalaryBonus();
    }

    @Override
    public void print() {
        System.out.println("Hello, world!");
    }

    public abstract void calculationSalaryBonus();
//    public abstract void calculationBase();
}
