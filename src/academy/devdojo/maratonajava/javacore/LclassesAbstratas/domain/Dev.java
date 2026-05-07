package academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain;

public class Dev extends Funcionario {

    public Dev(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Dev Dublin, name: " + name + " , salary: " + salary;
    }

    @Override
    public void calculationSalaryBonus() {
        salary = salary + salary * 0.2;
    }


}
