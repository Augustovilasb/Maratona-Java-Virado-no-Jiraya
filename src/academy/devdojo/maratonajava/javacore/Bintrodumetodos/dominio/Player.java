package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

public class Player {

    public String name;
    public int age;
    public double[] salaries;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary: salaries) {
            System.out.println(salary + " ");
        }
    }

    public void printAvgSalary(){
        double avg = 0;
        for (double salary: salaries) {
            avg += salary;
        }
        avg /= salaries.length;
        System.out.println("Avg salary: " + avg);
    }
}
