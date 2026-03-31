package academy.devdojo.maratonajava.javacore.Bintrodumetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.Employee;
import academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio.EmployeeService;

import java.util.Arrays;

public class EmployeeExercise {
    public static void main(String[] args) {

        Employee employee = new Employee();
        EmployeeService printer = new EmployeeService();

        employee.setName("Ciaran");
        employee.setAge(42);
        employee.setSalaries(new double[] {3000, 2200, 3214, 2580});

        System.out.println("######################################################");
        System.out.println("Employee Data Company The Gravediggers: ");
        printer.printEmployeeData(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(Arrays.toString(employee.getSalaries()));
        System.out.println("######################################################");
        System.out.println("Here we have the last 3 salary Average: ");
        printer.avgThreeSalary(employee);
        System.out.println("######################################################");
        System.out.println("Média " + employee.getAvg());
    }
}
