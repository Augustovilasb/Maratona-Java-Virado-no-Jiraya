package academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain;

public class Gerente extends Funcionario{

    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Gerente Loja, name: " + name + " , salary: " + salary;
    }

    @Override
    public void calculationSalaryBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }
}
