package academy.devdojo.maratonajava.javacore.Bintrodumetodos.dominio;

import java.util.Arrays;

public class EmployeeService {

    public void printEmployeeData(Employee employee) {

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary " + Arrays.toString(employee.getSalaries()));
    }

    public void avgThreeSalary(Employee employee) {
            double avg = 0;
        for (double salary : employee.getSalaries()) {
            avg += salary;
        }
        avg /= employee.getSalaries().length;
        employee.setAvg(avg);
        System.out.println("Avg salary: " + employee.getAvg());
    }




}




/*        double sumTotal = 0;
        for (int i = 0; i < employee.salary.length; i++) {
            sumTotal += employee.salary[i];
        }
        double avg = sumTotal / employee.salary.length;
        System.out.println("Média Salarial de cada funcionário: " + avg);*/
